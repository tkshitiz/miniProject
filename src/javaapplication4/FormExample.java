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
import java.awt.event.*;
import javax.swing.*;

public class FormExample{
    
    JFrame f= new JFrame("Form example");
    CalculatorHandler ch=new CalculatorHandler();
    JLabel l1=new JLabel("First number");
    JLabel l2=new JLabel("Second number");
     JLabel l3=new JLabel("Result");
   JTextField  t1=new JTextField("");
   JTextField  t2=new JTextField("");
   JTextField  t3=new JTextField("");
   JButton b1=new JButton("Add");
   JButton b2=new JButton("subtract");
   JButton b3=new JButton("multiply");
   JButton b4=new JButton("divide");
   
   FormExample()
   {
       f.add(l1);
       l1.setBounds(100,100,200,20);
       f.add(t1);
       t1.setBounds(200,100,200,20);
       f.add(l2);
        l2.setBounds(100,150,200,20);
        f.add(t2);
        t2.setBounds(200,150,200,20);
        f.add(l3);
        l3.setBounds(100,200,200,20);
        f.add(t3);
        t3.setBounds(200,200,200,20);
        f.add(b1);b1.setBounds(100,250,50,20);
        b1.setBorder(BorderFactory.createRaisedBevelBorder());
        b1.setActionCommand("add");
        b1.addActionListener(ch);
        f.add(b2);b2.setBounds(160,250,90,20);
        b2.setActionCommand("subtract");
        b2.addActionListener(ch);
        f.add(b3);b3.setBounds(260,250,90,20);
        b3.setActionCommand("multiply");
        b3.addActionListener(ch);
        f.add(b4);b4.setBounds(360,250,90,20);
         b4.setActionCommand("divide");
         b4.addActionListener(ch);
       f.setSize(500,500);
       f.setLayout(null);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
   }
     
   public class CalculatorHandler implements ActionListener {
       public void actionPerformed(ActionEvent e)
       {
           String num1,num2;
           num1=t1.getText();
           num2=t2.getText();
           double a,b,c=0;
           a=Double.parseDouble(num1);
           b=Double.parseDouble(num2);
           if(e.getActionCommand()=="add")
           {
               c=a+b;
           }
           else if(e.getActionCommand()=="subtract"){
           c=a-b;
       }
           else if(e.getActionCommand()=="multiply"){
               c=a*b;
           }
           else if(e.getActionCommand()=="divide"){
               c=a/b;
           }
           t3.setText(""+c);
           
       }
   }   
   
   public static void main(String[] args)
   {
       new FormExample();
   }
   
    
            
    
}
