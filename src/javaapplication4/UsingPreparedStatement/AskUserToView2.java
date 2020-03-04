/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.UsingPreparedStatement;

/**
 *
 * @author dell
 */
import java.sql.*;
import java.util.Scanner;
public class AskUserToView2 {
    Scanner sc=new Scanner(System.in);
    final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    final String DB_URL ="jdbc:mysql://localhost:3306/kshitiz_java2";
    final String DB_USERNAME = "root";
    final String DB_PASSWORD = "";
    void connectMeAndFireQuery(){
        try{
            Class.forName(DRIVER_NAME);
            Connection con;
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Which data you want to view. Enter Employee ID:");
            int eid=sc.nextInt();
            String myquery = "SELECT * FROM employee where emp_id=?";
            PreparedStatement pstmt = con.prepareStatement(myquery);
            pstmt.setInt(1,eid);
            ResultSet rs=pstmt.executeQuery();
            int id;
            long amt;
            String name;
            if(rs.next()){
                id =rs.getInt(1);
                name=rs.getString(2);
                amt = rs.getLong(3);
                System.out.println("Employee ID:"+id+"\t"
                +"Employee Name:"+name+"\t"
                +"Salary:"+amt+"\t"
            );
        }
            else
            {
                System.out.println("Record not found!!");
            }
            pstmt.close();
            con.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        AskUserToView2 pse1 =new AskUserToView2();
        pse1.connectMeAndFireQuery();
    }
}

