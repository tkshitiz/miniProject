/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

//Lab-2e- program to demonstrate gridlayout
import java.awt.*;
public class ScrollBarsExamplr extends Frame {
    ScrollBarsExamplr()
    {
        setTitle("Scroll bar example");
        setLayout(null);
        Label l= new Label("Horizontal Scrollbars");
        l.setBounds(100,50,200,20);
        Scrollbar s1=new Scrollbar(Scrollbar.HORIZONTAL);
        s1.setBounds(100,100,200,20);
        Label l2= new Label("Vertical Scrollbars");
        l2.setBounds(100,150,200,20);
        Scrollbar s2=new Scrollbar(Scrollbar.VERTICAL);
        s2.setBounds(100,200,200,20);
        add(l);
        add(l2);
        add(s1);
        add(s2);
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new ScrollBarsExamplr();
    }
}
