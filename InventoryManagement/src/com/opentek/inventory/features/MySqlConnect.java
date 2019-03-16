/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opentek.inventory.features;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MySqlConnect {
    public static Connection connectDB(){
        try{
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_management","test", "test");
          //  JOptionPane.showMessageDialog(null,"Connection succesfull","Connection",JOptionPane.INFORMATION_MESSAGE);
            return conn;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Connection Unsuccesfull" + e.getMessage(),"Connection",JOptionPane.ERROR_MESSAGE);
            return null;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Some error message"+e.getMessage(),"Connection",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
