/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.awt.*;
public class TextAreaExample {
   
    
    TextAreaExample(){
       Frame f= new Frame("TextArea example");
      TextArea area= new TextArea("lets write a paragraph");
      area.setBounds(50,100,200,60);
      f.add(area);
      f.setSize(500,500);
      f.setLayout(null);
      f.setVisible(true);
   }
public static void main(String[] args)
   {
      new TextAreaExample();
   }

}
