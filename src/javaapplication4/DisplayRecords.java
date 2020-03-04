/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author dell
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.util.Scanner;
public class DisplayRecords {
    
        final String DRIVER_NAME = "com.mysql.jdbc.Driver"; 
     final String DB_URL 
="jdbc:mysql://localhost:3306/java2lab";     
     final String DB_USERNAME = "root";     
     final String DB_PASSWORD = "";     
     int eid;     
     void getEmpID(){ 
         Scanner sc = new Scanner(System.in);       
         System.out.println("Enter Employee ID: ");        
         eid = sc.nextInt(); 
     }      void  connectMeAndFireQuery(){    
         try{ 
        Class.forName(DRIVER_NAME);         
        Connection con; 
        con = DriverManager.getConnection(DB_URL, DB_USERNAME, 
DB_PASSWORD); 
        String myQuery = "SELECT emp_name,emp_salary FROM salary WHERE emp_id =?"; 
        PreparedStatement pstmt;        
        pstmt = con.prepareStatement(myQuery);        
        pstmt.setInt(1,this.eid);        
        ResultSet rs;         
        rs = pstmt.executeQuery();         
        while(rs.next()) 
         { 
         String name= rs.getString("emp_name");          
         double sal = rs.getDouble("emp_salary"); 
         System.out.println("Employee ID = " +eid +"\t" 
                 + "Employee Name = "+ name+"\t" 
                 +"Salary = "+sal 
                ); 
         }                
        
        pstmt.close();         con.close(); 
        } catch (Exception e){   
            System.out.println(e); 
        }      }     public static void main(String[] args) {        Task4 t4 =new Task4();        t4.getEmpID();        t4.connectMeAndFireQuery(); 
    } 

} 





