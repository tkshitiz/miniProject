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
public class AaA {
   public interface NestedlF 
   { 
       boolean isNotNegative(int x); 
    } 
}  
class BbB implements AaA.NestedlF { 
    public boolean isNotNegative(int x) {
        return x < 0 ? false: true;
    }
} 
class NestedIFDemo { 
    public static void main(String args[]) {   
        AaA.NestedlF nif = new BbB(); 
        if(nif.isNotNegative(10))
            System.out.println("10 is not negative"); 
        if(nif.isNotNegative(-12)) 
            System.out.println("this won't be displayed");
        System.out.println("babita,B,04");
    }
}
 

