/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author dell
 */
public class getChars {
   
    public static void main(String args[]){ 
        String s = "This is a demo of the getChars method.";
        int start = 10; 
        int end = 14; 
        char buf[] = new char [end - start]; 
        s.getChars(start, end, buf, 0); 
        System.out.println(buf); 
        System.out.println("Manish,B,10");
    }
}

 

