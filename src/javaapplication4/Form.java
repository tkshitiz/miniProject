/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author dell
 */
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*; 
import java.util.Scanner;
public class Form implements ActionListener{
    JFrame f=new JFrame("student form");
    JLabel l1=new JLabel("Enter student id");
     JLabel l2=new JLabel("Enter student name");
      JLabel l3=new JLabel("Enter salary");
        JTextField  t1=new JTextField("Employee id");
          JTextField  t2=new JTextField("Employee name");
            JTextField  t3=new JTextField("Employee salary");
            
         JButton b=new JButton();
         
         Form()
         {
             f.add(l1);
             l1.setBounds(100,100,200,20);
             f.add(t1);
             t1.setBounds(100,150,200,20);
             f.add(l2);
             l2.setBounds(100,200,200,20);
             f.add(t2);
             t2.setBounds(100,250,200,20);
             f.add(l3);
             l3.setBounds(100,300,200,20);
             f.add(t3);
             t3.setBounds(100,350,200,20);
             f.add(b);
             b.setBounds(100,400,50,20);
        b.setBorder(BorderFactory.createRaisedBevelBorder());
        b.setActionCommand("save");
            b.addActionListener(this);
             
             
      f.setSize(500,500);
      f.setLayout(null);
      f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         } 
         @Override
          public void actionPerformed(ActionEvent e)
       {
           
       }

      final String driver_name = "com.mysql.jdbc.Driver"; 
     final String DB_URL="jdbc:mysql://localhost:3306/java2lab"; 
     
     final String DB_USERNAME = "root";   
     final String DB_PASSWORD = "";     
     static int count;    
     int rn; 
     String course;   
     Float marks;     
     void getData(){ 
         Scanner sc1 = new Scanner(System.in);    
         System.out.println("Enter Course Name:");      
         course =sc1.nextLine(); 
         System.out.println("Enter Roll Number:");      
         rn = sc1.nextInt(); 
         System.out.println("Enter Marks:");       
         marks = sc1.nextFloat();  
     }      
     void  connectMeAndFireQuery(){       
         try{ 
        Class.forName(driver_name);       
        Connection con; 
        con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD); 
        String myQuery = "INSERT INTO students VALUES(?,?,?)";     
        PreparedStatement pstmt;      
        pstmt = con.prepareStatement(myQuery);      
        pstmt.setInt(1, this.rn);       
        pstmt.setString(2,this.course);       
        pstmt.setFloat(3,this.marks);       
        int n=pstmt.executeUpdate();     
        count+=n;      
        pstmt.close();     
        con.close();     
         } 
         catch (Exception e){   
            System.out.println(e); 
        }   
     }   
     public static void main(String[] args) {    
         Form t3 =new Form(); 
   } 
} 
 
 


