/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.*;
 public class FisExample {
   public static void main(String[] args){
       final String FILEPATH="D:/kshitiz.txt";
       try{
           FileInputStream fis=new FileInputStream(FILEPATH);
           int v=fis.read();
           System.out.println((char)v);
           fis.close();
       }
       catch(IOException ioe){
           System.out.println("IO error"+ioe);
       }
   } 
}
