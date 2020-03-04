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
public class Exc2 {
   public static void main(String[] args){
       int d,a;
       try{
           d=0;
           a=42/d;
           System.out.println("this will b prnted");
       }
       catch(ArithmeticException e){
           System.out.println("division by 0");
       }
       System.out.println("after catch statement");
       System.out.println("babita,B,04");
   } 
}
