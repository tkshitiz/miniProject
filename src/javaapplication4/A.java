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
class A {
   A(){
       System.out.println("inside A's constructor");
   }
}
class B extends A{
    B(){
        System.out.println("inside B's constructor");
    }
}
   class C extends B{
    C(){
        System.out.println("inside C's constructor");
    }
} 
class Callingtons{
public static void main(String[] args){
C c=new C();
System.out.println("babita,B,04");
}
} 