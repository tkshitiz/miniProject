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

     public class Parent{
    protected int a;
    private int b;
    int c;
    int addition(){
        c=a+b;
        return c;
    }
}
class Child extends Parent {
    void display(){
        System.out.println("a="+a);
     // System.out.println("b="+b); // error
        System.out.println("c="+addition());
    }
    public static void main(String[] args){
        Child c=new Child();
        c.display();
        System.out.println("babita,B,04");
    }
}


