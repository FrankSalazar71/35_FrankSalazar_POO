/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conex {

    Connection con;

    public conex() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/persona2", "root", "admin");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error conexion " + e);
        }
    }

    public Connection getConnection() {
        return con;
    }
}
