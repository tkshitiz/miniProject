/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.InsertingValues;

/**
 *
 * @author dell
 */
import java.sql.*;
class InsertingValues{
    public static void main(String args[])throws Exception{
        String className = "com.mysql.jdbc.Driver";
        String db_url ="jdbc:mysql://localhost:3306/kshitiz_java2";
        String db_username="root";
        String db_password="";
        Class.forName(className);
        Connection con =DriverManager.getConnection(db_url,db_username,db_password);
        Statement stmt=con.createStatement();
        String my_query= "insert into students values(5,'Ramesh','Thapa','satdobato',9869370501)";
        int res = stmt.executeUpdate(my_query);
        System.out.println(res +"row(s) inserted");
        stmt.close();
        con.close();
    }
}

