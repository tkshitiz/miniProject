/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import javaapplication4.OuterDemo35.Inner_Demo35;


class OuterDemo35 {
 private int num=175;
  public class Inner_Demo35{
       int getNum(){
        System.out.println("this is the get num method of the inner class");
        return num;
      }
  }
}


public class MyClass2{
    public static void main(String[] args){
        OuterDemo35 outer=new OuterDemo35();
        OuterDemo35.Inner_Demo35 inner =outer.new Inner_Demo35();
        System.out.println(inner.getNum());
        
    }
}
