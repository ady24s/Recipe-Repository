/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectorDB {

     public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/RECIPE", "adyasha", "1403@Adya");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}



 