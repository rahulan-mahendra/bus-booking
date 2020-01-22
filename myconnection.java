/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Rahulan
 */
public class myconnection {
     public static Connection getDBConnection (){
         Connection conn = null;
         try{
            final String DBURL="jdbc:mysql://localhost:3307/code_stars";
            final String USERNAME="root";
            final String PASSWORD="9824";
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            return conn;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Not connected!!");
            return conn;
        }
     }
}

