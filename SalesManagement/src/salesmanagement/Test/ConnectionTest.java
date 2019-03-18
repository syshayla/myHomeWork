/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesmanagement.Test;

import salesmanagement.Conn.CustomDBConnection;

/**
 *
 * @author Sumaiya
 */
public class ConnectionTest {
    public static void main(String[] args) {
        CustomDBConnection.getDBConnection();
    }
}
