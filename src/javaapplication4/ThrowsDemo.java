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
public class ThrowsDemo {
  static void throwone()throws IllegalAccessException{
      System.out.println("inside throwone");
      throw new IllegalAccessException("demo");
  } 
  public static void main(String[] args){
      try{
         throwone(); 
      }
      catch(IllegalAccessException e){
          System.out.println("caught"+e);
      }
      System.out.println("babita,04,B");
  }
}
