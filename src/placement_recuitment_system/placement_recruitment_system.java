/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement_recuitment_system;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class placement_recruitment_system{
    private static final String USERNAME= "root";
    private static final String PASSWORD= "";
    private static final String  CSTRING= "jdbc:mysql://localhost:3306/placement_recruitment_system";
    

    public static void main(String args[]) {        
try{
    Connection conn;
   conn = DriverManager.getConnection(CSTRING,USERNAME,PASSWORD);
    System.out.println("connected");
    Statement stmt = (Statement) conn.createStatement();
    
    
    
    
}catch(SQLException e){
    System.err.println(e);
}
    }

       
   
}
