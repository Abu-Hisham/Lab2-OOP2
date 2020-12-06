/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.DriverManager;


/**
 *
 * @author Mohammed Hiribae <BBIT@22>
 */
public class DBConnection {
    public static Connection conn = null;
    
    
    public DBConnection(){
        connect();
    }
    
    public static Connection connect(){
        try {
            String url = "jdbc:mysql://localhost:3306/cat2?verifyServerCertificate=false&useSSL=false&requireSSL=false";
            String username = "root";
            String password = "Pass@word1";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,username, password);
            
        } catch (Exception e) {
            System.err.println("Error Connecting to the Database: " + e.getMessage());
        }
        return conn;
    }
}


