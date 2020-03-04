/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

public class Outer35 {
    static class Nested_demo{
       public void my_method()
       {
           System.out.println("i am from static nested class");
                  
       }
       public static void main(String[] args){
          Outer35.Nested_demo ob=new Outer35.Nested_demo();
          ob.my_method();
          System.out.println("manish,10,B");
       }
       
   } 
}


