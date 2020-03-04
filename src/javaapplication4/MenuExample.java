/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.awt.*;
public class MenuExample {
   
    
    MenuExample(){
       Frame f= new Frame("Menu and Menu item");
      MenuBar mb= new MenuBar();
      Menu sm1 =new Menu("Faculties");
      Menu sm2 =new Menu("science");
      Menu sm3 =new Menu("Management");
      MenuItem i1,i2,i3,i4;
      i1=new MenuItem("Humanities");
      i2=new MenuItem("BBM");
      i3=new MenuItem("BIM");
      i4=new MenuItem("BSc.CSIT");
      sm1.add(sm2);
      sm1.add(sm3);
      sm2.add(i4);
      sm3.add(i1);
      sm3.add(i2);
      sm3.add(i3);
      
      mb.add(sm1);
      f.setMenuBar(mb);
      f.setSize(500,500);
      f.setLayout(null);
      f.setVisible(true);
   }
public static void main(String[] args)
   {
      new MenuExample();
   }

}
