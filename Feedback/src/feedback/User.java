/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedback;

/**
 *
 * @author Khanh
 */
public class User {
    String userName = "";
    String password = "";
    String email = "";
    Login log = new Login();
    String tmpPass = log.getUserName();
}
