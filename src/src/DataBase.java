/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bogar
 */
public class DataBase {
    private static Connection con;
    private static Statement statmnt;
    private static String url = "jdbc:mysql://localhost:3306?serverTimezone=UTC&useSSL=false";
    
    public static void init(String user, String psw) throws SQLException{
        //Read Data from files
        con = DriverManager.getConnection(url,user,psw);
        statmnt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        //DriverManager.getConnection(psw, null);
        
    }
}
