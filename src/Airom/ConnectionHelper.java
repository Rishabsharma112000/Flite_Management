/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Airom;

import java.sql.*;

/**
 *
 * @author Rishabh sharma
 */
public class ConnectionHelper {
    
// private static int Ticket;
   private static int Tic = 200239000;
   
     public static int getTickeNo()
   {
       
      Tic++;
      return Tic;
   }
  
   
  public static Connection getCon()
  {
        
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flites","root","112000");
          System.err.print("done");
          return con;
      } catch (Exception e) {
          System.err.println("H;lelll");
          System.out.println(e);
          return null;
      }
  }

 
}
