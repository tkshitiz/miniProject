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
    public class SuperClass {
  int age; 
  
   SuperClass(int age) {       
       this.age = age;   	  
   }   
   public void getAge() { 
      System.out.println("The value of the variable named age in super class is: " +age); 
   }
} 
   class Subclass extends SuperClass 
  {    
    Subclass(int age) 
    {       
        super(age); 
   }    
    public static void main(String args[]) {
       Subclass s = new Subclass(24); 
      s.getAge();
      System.out.println("babita,B,04");
   }
} 
  

