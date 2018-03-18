/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billeterie;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class Connexion {
   // Connection cnx;
    public static Connection ConnecterDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
        }catch(ClassNotFoundException e){
            System.out.println(e);  
        }
        try{
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/billetrie","root","");    
          
           System.out.println("DataBase connected!!!");
           return cnx;
            
        }catch(SQLException e){
            System.err.println(e);
            return null;
        }
        
    }
}
   
