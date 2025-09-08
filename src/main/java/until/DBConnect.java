/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package until;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DBConnect {
    static String url = "jdbc:sqlserver://localhost:1433;databaseName=XayDungUngDungGiatUi;encrypt=false";
    static String user = "sa";
    static String pass = "C24";
    
    public static Connection getConnection()
    {
        Connection conn=null;
        try {
            //nap driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // 2. Kết nối CSDL
             conn = DriverManager.getConnection(url, user, pass);        
        } catch (Exception ex) {
            System.out.println("Loi: " + ex.toString());
        }
        return conn;
    }
    
    public static void main(String[] args) {
        System.out.println(DBConnect.getConnection());
    }
}