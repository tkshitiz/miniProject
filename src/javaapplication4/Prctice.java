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
public class Prctice {
 static int a=5;
 static int b;
  static void meth(int x)
 {
     System.out.println("x="+x);
        System.out.println("a="+a);
           System.out.println("b="+b);
 }
 static{
        System.out.println("Static block initialaized");
        b=a*4;
 }
 public static void main(String[] args){
    
     meth(40);
 }
}
