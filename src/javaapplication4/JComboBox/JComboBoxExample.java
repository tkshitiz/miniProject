/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.JComboBox;

/**
 *
 * @author dell
 */
import javax.swing.*;
import java.awt.event.*;
public class JComboBoxExample{
JFrame f=new JFrame("JComboBox Demo");
JLabel l1 = new JLabel();
JComboBox cb1;
void makeMyWindow(){
JLabel l2 = new JLabel("Select Your Birth Month");
l2.setBounds(50, 50, 200, 30);
l1.setBounds(50, 300,200, 20);
//array to store months
String months[]={"January", "February", "March",
"April","May", "June", "July", "August",
"September", "October", "November", "December"};
//creating object of handler class
MyHandler h= new MyHandler();
//comboBox
cb1 =new JComboBox(months);
cb1.setBounds(50, 100,90,20);
cb1.addActionListener(h);
f.add(cb1); f.add(l1); f.add(l2);
f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
//inner class to handel event
class MyHandler implements ActionListener {
@Override
public void actionPerformed(ActionEvent ae){
String m =(String)cb1.getSelectedItem();
l1.setText("Your Birth Month is "+m);
}
}
public static void main(String[] args) {
JComboBoxExample cmb= new JComboBoxExample();
cmb.makeMyWindow();
}
}

