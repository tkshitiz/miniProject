/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.UsingPreparedStatement;
import java.sql.*;
import java.util.Scanner;

     public class AskUser{
        Scanner sc=new Scanner(System.in);
        final String driver_name="com.mysql.jdbc.Driver";
        final String db_url="jdbc:mysql://localhost:3306/kshitiz_java2";
        final String db_username="root";
        final String password="";
        
        void connectMeAndFireQuery()
        {
            try{
                System.out.println("enter how much data you want to enter");
                String num=sc.nextLine();
                Class.forName(driver_name);
                Connection con=DriverManager.getConnection(db_url,db_username,password);
                String myquery="insert into students values(?,?,?,?,?)";
                PreparedStatement psmt=con.prepareStatement(myquery);
                for(int i=0;i<Integer.parseInt(num);i++)
                {
                    System.out.println("enter roll no:");
                    String roll=sc.nextLine();
                     System.out.println("enter first name:");
                    String fn=sc.nextLine();
                     System.out.println("enter last name:");
                    String ln=sc.nextLine();
                     System.out.println("enter phone no:");
                    String phone=sc.nextLine();
                     System.out.println("enter address:");
                    String address=sc.nextLine();
                    psmt.setInt(1,Integer.parseInt(roll));
                    psmt.setString(2,fn);
                    psmt.setString(3,ln);                    
                    psmt.setString(4,address);
                    psmt.setLong(5,Long.parseLong(phone));
                    int n=psmt.executeUpdate();
                    System.out.println("thank you "+n+" record is added");
                }
                psmt.close();
                con.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        public static void main(String[] args)
        {
            AskUser au=new AskUser();
            au.connectMeAndFireQuery();
            
        }
        
}
