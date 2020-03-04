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
public class AA{
      int i; 
} 
// Create a subclass by extending class A. 
class BB extends AA { 
    int i; // this i hides the i in A 
    BB(int a, int b) { 
        super.i = a; // i in A 
        i = b; // i in B 
    } 
    void show() { 
        System.out.println("i in superclass: " + super.i); 
        System.out.println("i in subclass: " + i);  
    } 
} 
class UseSuper { 
    public static void main(String args[]) { 
        BB subOb = new BB(1, 2); 
        subOb.show(); 
        System.out.println("babita,B,04");
    } 
  
}
