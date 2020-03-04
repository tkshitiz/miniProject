/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.DeleteUsingPreparedStatement;

/**
 *
 * @author dell
 */
import java.sql.*;
import java.util.Scanner;
public class PSExample3 {
    final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    final String DB_URL ="jdbc:mysql://localhost:3306/kshitiz_java2";
    final String DB_USERNAME = "root";
    final String DB_PASSWORD = "";
    int rn;
    void getRoll(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Whose data is to be deleted? Enter Roll No: ");
        rn = sc.nextInt();
    }
    void connectMeAndFireQuery(){
        try{
            Class.forName(DRIVER_NAME);
            Connection con;
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            String myQuery = "DELETE FROM students WHERE roll_no =? ";
            PreparedStatement pstmt;
            pstmt = con.prepareStatement(myQuery);
            pstmt.setInt(1, rn);
            int n = pstmt.executeUpdate();
            System.out.println("The record is deleted!");
            pstmt.close();
            con.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        PSExample3 pse3 =new PSExample3();
        pse3.getRoll();
        pse3.connectMeAndFireQuery();
    }
}

