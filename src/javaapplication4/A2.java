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
public class A2 {
  
    public void poo() {
        System.out.println("Hello");
    }
}


package mypack;
class B2 {
    public static void main(String args[]) {
        javaapplication4.A2 obj = new javaapplication4.A2(); //using fully qualified name
        obj.poo();
        System.out.println("Manish,B,10");
    }	}
 

