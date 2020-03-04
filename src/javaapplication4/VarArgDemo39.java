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
public class VarArgDemo39 {
static void mymethod(int...a)
 {
     System.out.println("i m vararg method");
      System.out.println("number of variable arguments in this call "+a.length);
       System.out.println("and the variable arguments are as follow");
       for(int x:a)
       {
            System.out.print(x+" ");
       }
        System.out.println("\n");
        
 }
 static void anothermethod(String s,int...b)
        {
            System.out.println("i m vararg method");
      System.out.println("number of variable arguments in this call "+b.length);
       System.out.println("and the variable arguments are as follow");
       for(int x:b)
       {
            System.out.print(x+" ");
       }
        System.out.println("\n");
        
        }

 public static void main(String[] args){
     mymethod();
      mymethod(1,10);
       mymethod(0,2,6,8);
       anothermethod("first");
       anothermethod("second",2,3);
       anothermethod("third",0,1,5);
       System.out.println("babita,04,B");
 }

}
