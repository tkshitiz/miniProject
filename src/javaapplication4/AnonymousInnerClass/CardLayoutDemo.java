/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.AnonymousInnerClass;

/**
 *
 * @author dell
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CardLayoutDemo extends JFrame {
    CardLayout card;
    JButton b1,b2,b3;
    Container c;
    CardLayoutDemo(){
        c=getContentPane();
        card=new CardLayout(40,30);
        c.setLayout(card);
        b1=new JButton("ONE");
        b2=new JButton("TWO");
        b3=new JButton("THREE");
        ActionListener ac;
        ac = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                card.next(c);
            }
        };
        b1.addActionListener(ac);
        b2.addActionListener(ac);
        b3.addActionListener(ac);
        c.add(b1);c.add(b2);c.add(b3);
    }
    public static void main(String[] args) {
        CardLayoutDemo cd=new CardLayoutDemo();
        cd.setSize(400,400);
        cd.setVisible(true);
        cd.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

