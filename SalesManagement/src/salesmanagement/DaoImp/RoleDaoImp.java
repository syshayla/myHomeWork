/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesmanagement.DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import salesmanagement.Conn.CustomDBConnection;
import salesmanagement.Dao.RoleDao;
import salesmanagement.POJO.Role;

/**
 *
 * @author Sumaiya
 */
public class RoleDaoImp implements RoleDao{
    Connection conn = CustomDBConnection.getDBConnection();
    public static void main(String[] args) {
        RoleDaoImp tb = new RoleDaoImp();
        tb.createTable();
    }

    @Override
    public void createTable() {
    String sql = "create table if not exists role(id int(2)auto_increment primary key, role_name varchar(20)unique)";    
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("Table created!");
        } catch (Exception e) {
        }
    }

    @Override
    public void save(Role role) {
        String sql = "insert into role(role_name) values(?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, role.getRoleName());
            pstm.executeUpdate();
            System.out.println("Insert success!");
        } catch (Exception e) {
        }
    }

    @Override
    public void update(Role role) {
    String sql = "update role set role_name=? where id=?";
     try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, role.getRoleName());
            pstm.setInt(2, role.getId());
            pstm.executeUpdate();
            System.out.println("update success!");
        } catch (Exception e) {
        }
    }

    @Override
    public Role getRoleById(int id) {
        Role role = new Role();
        String sql = "select * from role where id=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs= pstm.executeQuery();
            while(rs.next()){
                role.setId(rs.getInt(1));
                role.setRoleName(rs.getString(2));
            }
            System.out.println("Insert success!");
        } catch (Exception e) {
        }
         return role;
        
    }

    @Override
    public Role getRolebyRolename(String roleName) {
        Role role = new Role();
        String sql = "select * from role where role_name=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, roleName);
            ResultSet rs= pstm.executeQuery();
            while(rs.next()){
                role.setId(rs.getInt(1));
                role.setRoleName(rs.getString(2));
            }
            System.out.println("Insert success!");
        } catch (Exception e) {
        }
         return role;
       }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Role> getRole() {
        List <Role> list = new ArrayList<>();
        String sql = "select * from role";
        
        try {
            PreparedStatement ps = CustomDBConnection.getDBConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Role role = new Role(rs.getInt(1), rs.getString(2));
               list.add(role);
        }
        }
         catch (SQLException ex) {
            Logger.getLogger(RoleDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  list;
    }

    

   
    
}
