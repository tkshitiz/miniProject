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
    public class OuterClass {
      void mymethod(){
          int num=23;
          class methodinnerDemo{
              public void print(){
                  System.out.println("this is method inner class "+num);
              }
          }
          methodinnerDemo inner=new methodinnerDemo();
          inner.print();
      }
            public static void main(String[] args){
                OuterClass outer=new OuterClass();
                outer.mymethod();
            }
    }
