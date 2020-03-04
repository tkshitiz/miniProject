/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

//Lab-2e- program to demonstrate gridlayout
import java.awt.*;
public class TextFieldExample{
   
       
    public static void main(String[] args)
    {
       Frame f= new Frame("Textfield example");
        TextField t1,t2;
        Label l1=new Label("textfield for p1");
         l1.setBounds(100,50,200,20);
        t1= new TextField("Programmin is fun");
        t1.setBounds(100,70,200,20);
          Label l2=new Label("textfield for p2");
           l2.setBounds(100,150,200,20);
         t2= new TextField("Programming is fun");
        t2.setBounds(100,170,200,20);
        f.add(l1);
         f.add(l2);
        f.add(t1);
        f.add(t2);
        
        f.setSize(500,500);
        f.setLayout(null);
       f.setVisible(true);
    }
}

