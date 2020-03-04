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
import javax.swing.*;
public class TableDemo {
JFrame f;
TableDemo(){
f=new JFrame();
String data[][]={ {"101","kshitiz","satdobato"},
{"102","ram","sarlahi"},
{"103","binod","illam"},
{"104","suvam","kalanki"}
};
String column[]={"Roll No.","Name","Address"};
JTable jt=new JTable(data,column);
jt.setBounds(30,40,200,300);
JScrollPane sp=new JScrollPane(jt);
f.add(sp);
f.setSize(300,200);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new TableDemo();
}
}