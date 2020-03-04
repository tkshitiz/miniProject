/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.*;
public class isDiectory {
    public static void main(String[] args){
        
        File f1=new File("D:/lan.txt");
        if(f1.isDirectory())
        {
            String s[]=f1.list();
            for(int i=0;i<s.length;i++){
                File f= new File("D:/lan.txt"+"/"+s[i]);
                       if(f.isDirectory()) {
                           System.out.println(s[i]+"is a directory");
                       }
                       else
                           System.out.println(s[i]+"is a file.");
            }
        }
        
    }
}
