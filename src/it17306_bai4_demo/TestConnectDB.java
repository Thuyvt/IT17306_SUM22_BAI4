package it17306_bai4_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author THUYVU
 */
public class TestConnectDB {
    static String hostName = "localhost";
    static String account = "sa";
    static String pass = "123456";
    static String dbName = "JDBC_DEMO";
    static String connectionSql = "jdbc:sqlserver://" + hostName + ":1433;databaseName=" + dbName;
    
    public static void main(String[] args) {
        try {
            // B1: Load driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // B2: Tao ket noi - mo ket noi den sql server
            Connection conn = DriverManager.getConnection(connectionSql, account, pass);

            // B3: Tao Statement sau do thuc thi cau lenh tuong tac voi sql
            Statement st = conn.createStatement();

            // B4: Thuc thi cau lenh sql
            String sql = "SELECT * FROM MANAGE_USER";

            ResultSet rs = st.executeQuery(sql);
            // Dong ket noi sau khi thuc thi cau lenh
            st.close();
            conn.close();
            System.out.println("Ket noi thanh cong");
        } catch (Exception ex) {
            System.out.println("Ket noi that bai");
        }
    }
}
