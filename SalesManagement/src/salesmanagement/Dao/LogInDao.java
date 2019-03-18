/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesmanagement.Dao;

import salesmanagement.POJO.User;

/**
 *
 * @author Sumaiya
 */
public interface LogInDao {
    User findbyUsernameAndPassword(String username, String password);
}
