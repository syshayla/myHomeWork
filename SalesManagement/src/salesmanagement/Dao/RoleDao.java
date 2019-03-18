/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesmanagement.Dao;

import java.util.List;
import salesmanagement.POJO.Role;


/**
 *
 * @author Sumaiya
 */
public interface RoleDao {
    void createTable();
    void save(Role role);
    void update(Role role);
    Role getRoleById(int id);
    Role getRolebyRolename(String roleName);
    void delete(int id);
    List<Role> getRole();
    
}
