/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.KeyDataFromUser;

/**
 *
 * @author dell
 */

import java.sql.*;
import java.util.Scanner;
public class AskUserToView{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String className = "com.mysql.jdbc.Driver";
        String db_url = "jdbc:mysql://localhost:3306/kshitiz_java2";
        String db_username = "root";
        String db_password = "";
        try{
            Class.forName(className);
            Connection con= DriverManager.getConnection(db_url,db_username,db_password);
            Statement stmt= con.createStatement();
            System.out.println("Which data you want to view. Enter Roll No:");
            int n=sc.nextInt();
            String myquery = "SELECT * FROM students where roll_no="+n;
            ResultSet rs=stmt.executeQuery(myquery);
            int rn;
            long phn;
            String fn,ln,adr;
         
            if(rs.next()){
                rn =rs.getInt(1);
                fn =rs.getString(2);
                ln = rs.getString(3);
                phn = rs.getLong(5);
                adr = rs.getString(4);
                System.out.println("Roll Number:"+rn+"\t"
                +"First Name:"+fn+"\t"
                +"Last Name:"+ln+"\t"
                +"Phone Number:"+phn+"\t"
                +"Address:"+adr+"\t"
            );
        }
            else
            {
                System.out.println("Record not found!!");
            }
            
          
            
        stmt.close();
        con.close();
        } catch(Exception excp){
            System.out.println(excp);
        }
    }
}

