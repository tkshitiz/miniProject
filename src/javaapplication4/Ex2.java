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
public class Ex2 {

    public static void main(String[] args) {
        int d, a; 
        try { 
            d = 0; 
            a = 42 / d; 
            System.out.println("This will not be printed.");
        }
        catch(ArithmeticException e) {  
            System.out.println("Division by zero."); 
        }
        System.out.println("After catch statement.");
        System.out.println("manish,B,10");
    } 
}


