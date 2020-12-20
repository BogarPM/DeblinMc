/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bogar
 */
public class DataBase {
    private static Connection con;
    private static Statement statmnt;
    private static String url = "";
    
    public static void init(String user, String psw){
        //Read Data from files
        
        
        //DriverManager.getConnection(psw, null);
        
    }
}
