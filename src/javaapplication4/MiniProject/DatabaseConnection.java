/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.MiniProject;



import java.sql.*;
//import javaapplication4.MiniProject.Registration;
/**
 *
 * @author dell
 */
public class DatabaseConnection {
   //****************************DATABASE CONNECTION**************//////       
      public static void main(String[] args){
        final String driver_name="com.mysql.jdbc.Driver";
        final String db_url="jdbc:mysql://localhost:3306/kshitiz_java2";
        final String db_username="root";
        final String db_password="";
//*****************************END OF DATABASE CONNECTION*************//////        
        
//**********************************************************************//////
             
                Class.forName(driver_name);
                Connection con =DriverManager.getConnection(db_url,db_username,db_password);
                Statement stmt=con.createStatement(); 
                String name=(String)tname.getText();
                String address=(String)tadd.getText();
                String phone=(String)mno.getText();
                String gender=gengp.getSelection().getActionCommand();
                String dob=(String)date.getSelectedItem();               
                String myquery="insert into user_details(name,address,phone_number,gender,dob) values(name,address,phone,gender,dob)";
                 int res = stmt.executeUpdate(myquery);
                stmt.close();
                con.close();
      }
 
}
