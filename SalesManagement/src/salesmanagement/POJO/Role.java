/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesmanagement.POJO;

/**
 *
 * @author Sumaiya
 */
public class Role {
    private int id;
    private String roleName;

    public Role() {
    }

    public Role(int id) {
        this.id = id;
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }
    

    public Role(int id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    
}
