/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.TextFieldDemo;

/**
 *
 * @author dell
 */
import java.awt.event.*;
import javax.swing.*;
public class TextFieldDemo extends JFrame{
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;
    JLabel l1,l2,l3;
    TextFieldDemo(){
        CalculatorHandler tf=new CalculatorHandler();
        JFrame f=new JFrame("Calculator");
        l1=new JLabel("First Number:");
        l2=new JLabel("Second Number:");
        l3=new JLabel("Result");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        l1.setBounds(100,50,120,20);
        f.add(l1);
        t1.setBounds(240,50,50,20);
        f.add(t1);
        l2.setBounds(100,80,130,20);
        f.add(l2);
        t2.setBounds(240,80,50,20);
        f.add(t2);
        l3.setBounds(100,110,140,20);
        f.add(l3);
        t3.setBounds(240,110,50,20);
        f.add(t3);
        b1=new JButton("Add");
        b2=new JButton("Subtract");
        b3=new JButton("Multiply");
        b4=new JButton("Divide");
        b1.setActionCommand("Add");
        b2.setActionCommand("Subtract");
        b3.setActionCommand("Multiply");
        b4.setActionCommand("Divide");
        b1.setBounds(100,150,100,50);
        b1.addActionListener(tf);
        f.add(b1);
        b2.setBounds(200,150,100,50);
        b2.addActionListener(tf);
        f.add(b2);
        b3.setBounds(300,150,100,50);
        b3.addActionListener(tf);
        f.add(b3);
        b4.setBounds(400,150,100,50);
        b4.addActionListener(tf);
        f.add(b4);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public class CalculatorHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String n1,n2;
            n1=t1.getText();
            n2=t2.getText();
            double a,b,c=0.0;
            a=Double.parseDouble(n1);
            b=Double.parseDouble(n2);
            if(e.getActionCommand()=="Add"){
                c=a+b;
            }else if(e.getActionCommand()=="Subtract"){
                c=a-b;
            }else if(e.getActionCommand()=="Multiply"){
                c=a*b;
            }else if(e.getActionCommand()=="Divide"){
                c=a/b;
            }
            t3.setText(" "+c);
        }
    }
    public static void main(String[] args){
        new TextFieldDemo();
    }
}
