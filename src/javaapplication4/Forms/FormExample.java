/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.Forms;

/**
 *
 * @author dell
 */
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class FormExample implements ActionListener {
    JLabel l,l1,l2,l3;
    JTextArea t1,t2,t3;
    FormExample(){
        JFrame f=new JFrame("Form");
        l=new JLabel("Enter the data");
        l.setBounds(10,20,200,20);
        l1=new JLabel("emp_id");
        l1.setBounds(10,40,200,20);
        t1=new JTextArea();
        t1.setBounds(120, 40, 200, 20);
        l2=new JLabel("emp_name");
        l2.setBounds(10,70,200,20);
        t2=new JTextArea();
        t2.setBounds(120, 70, 200, 20);
        l3=new JLabel("emp_salary");
        l3.setBounds(10,100,200,20);
        t3=new JTextArea();
        t3.setBounds(120, 100, 200, 20);
        JButton b=new JButton("Save");
        b.setBounds(10, 150, 200, 20);
       b.addActionListener(this);
       f.add(l);
       f.add(l1);
       f.add(t1);f.add(l2);f.add(t2);f.add(l3);f.add(t3);f.add(b);
        f.setSize(800,800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String a=t1.getText();
        String b=t2.getText();
        String c=t3.getText();
        new Insert(a,b,c);
    }
    public static void main(String[] args){
       FormExample fe=new FormExample();
    }
}



///Insert.java
 class Insert {
    final String DRIVER_NAME="com.mysql.jdbc.Driver";
    final String DB_URL="jdbc:mysql://localhost:3306/kshitiz_java2";
    final String DB_USERNAME="root";
    final String DB_PASSWORD="";
    int id;
    Float emp_salary;
    String name;
    Insert(String a,String b,String c){
        id=Integer.parseInt(a);
        name=b;
        emp_salary=Float.parseFloat(c);
        try{
            Class.forName(DRIVER_NAME);
            Connection con=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            String Query="INSERT INTO employee VALUES(?,?,?)";
            PreparedStatement ps=con.prepareStatement(Query);
            ps.setInt(1,id);
            ps.setString(2, name);
            ps.setFloat(3, emp_salary);
            int n;
            n=ps.executeUpdate();
            System.out.println("Record added in the table");
            ps.close();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    } 
}


