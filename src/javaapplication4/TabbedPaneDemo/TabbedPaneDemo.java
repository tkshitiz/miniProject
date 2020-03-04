/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.TabbedPaneDemo;

/**
 *
 * @author dell
 */
import javax.swing.*;
public class TabbedPaneDemo {
    JFrame f;
    JPanel p1,p2,p3;
    JLabel l1,l2,l3,l4;
    void makeMyTabbedPane(){
        f=new JFrame("TabbedPane Example");
        p1=new JPanel();
        l1 =new JLabel("Welcome to Dashboard");
        p1.add(l1);
        p2=new JPanel();
        l2 = new JLabel("Your Profile");
        p2.add(l2);
        p3=new JPanel();
        l3 = new JLabel ("Help Section");
        p3.add(l3);
        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(50,10,200,200);    
        tp.add("dashboard",p1);
        tp.add("Profile",p2);
        tp.add("Help",p3);
        f.add(tp);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        TabbedPaneDemo tpd = new TabbedPaneDemo();
        tpd.makeMyTabbedPane();
    }
}

