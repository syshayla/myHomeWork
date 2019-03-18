/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesmanagement.POJO;

import javax.management.relation.Role;

public class User {
    private int id;
     private String fullname;
   
    private String username;
    private String password;
    private String mobile;
    private Role role;

    public User() {
    }

    public User(int id) {
        this.id = id;
    }
    

    public User(String fullname, String username, String password, String mobile, Role role) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
        this.role = role;
    }

    public User(int id, String fullname, String username, String password, String mobile, Role role) {
        this.id = id;
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    
}
