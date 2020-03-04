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


  public class OverloadingVarArg {
    static void fun(int ...a){
        System.out.println("Length of VarArg(int ...a)= "+a.length);
    }
    static void fun(boolean ...b){
        System.out.println("Length of VarArg(boolean ...b)= "+b.length);
    }
    static void Method1(String s,int ...a){
        System.out.println("Hello");
    }
    static void Method1(double d,int ...b){
        System.out.println("Hi");
    }
    public static void main(String[] args){
        fun(1);
        fun(true,false,true);
        Method1("First",5);
        Method1(3.5,6,7);
        System.out.println("babita,B,04");
    }
 }

  

