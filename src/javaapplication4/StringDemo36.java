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
public class StringDemo36 {
    public static void main(String[] args){
        String strob1="first string";
        String strob2="second string";
        String strob3="third string";
        System.out.println("length of strob1"+strob1.length());
        System.out.println("char at index 3 in strob1 "+strob1.charAt(3));
        if(strob1.equals(strob2))
         System.out.println("strob1==strob2");   
        else
             System.out.println("strob1!=strob2"); 
        if(strob1.equals(strob3))
             System.out.println("strob1==strob3"); 
        else
             System.out.println("strob1!=strob3"); 
          System.out.println("manish,10,B");
        
    }
}
