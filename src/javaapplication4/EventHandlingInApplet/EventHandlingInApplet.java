/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.EventHandlingInApplet;

/**
 *
 * @author dell
 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class EventHandlingInApplet extends Applet implements ActionListener {
    /*<applet code="EventHandlingInApplet" width=500 height=500></applet>*/
    Label l1 = new Label("String length Calculator");
    Label l2 =new Label("Enter a string : ");
    Label l3 = new Label();
    TextField t = new TextField();
    Button b = new Button("Find Length");
    public void init() {
        setSize(500,500);
        setLayout(null);
        l1.setBounds(50,50,200,20);
        l2.setBounds(50,70,200,20);
        t.setBounds(50,90,300,40);
        b.setBounds(50,150,100,30);
        b.addActionListener(this);
        l3.setBounds(50,200,300,20);
    }
    public void start(){
        add(l1);add(l2);add(t);add(b);add(l3);
    }
    public void actionPerformed(ActionEvent ae){
        String s= t.getText();
        int len = s.length();
        l3.setText("The length of given string is = "+ len);
    }
}

