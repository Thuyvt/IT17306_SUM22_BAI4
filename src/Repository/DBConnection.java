/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.sql.*;

/**
 *
 * @author THUYVU
 */
public class DBConnection {
    private static String hostName = "localhost";
    private static String account = "sa";
    private static String pass = "123456";
    private static String dbName = "JDBC_DEMO";
    private static String connectionSQL = "jdbc:sqlserver://"+hostName+":1433;databaseName=" +dbName;
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static Connection cnn;
    
    // LOAD DRIVER
    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
        }
    }
    
    // Mo ket noi 
    static Connection openDbConnection(){
        try {
            return DriverManager.getConnection(connectionSQL, account,pass );
        } catch (SQLException ex) {
            return null;
        }
    }
}
