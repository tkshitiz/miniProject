/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.*;
public class FOSexample {
   public static void main(String[] args)throws Exception{
      FileOutputStream fos=new FileOutputStream("D:/abc.txt"); 
      fos.write(66);
      fos.write('T');
      String s="how are you";
      byte a[]=s.getBytes();
      fos.write(a);  
      fos.close();
      System.out.println("file writting completed");
   }
           
}
