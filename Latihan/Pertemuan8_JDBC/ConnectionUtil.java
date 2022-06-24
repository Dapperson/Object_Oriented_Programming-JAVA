/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan8_JDBC;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static Pertemuan8_JDBC.DemoOpenConnection.JDBC_URL;
import static Pertemuan8_JDBC.DemoOpenConnection.PASSWORD;
import static Pertemuan8_JDBC.DemoOpenConnection.USER;

/**
 *
 * @author Asus
 */
public class ConnectionUtil {
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/library";
    static final String USER = "root";
    static final String PASSWORD = "";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL,USER,PASSWORD);
       }
    
}
