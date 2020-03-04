/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.lang.annotation.*; 
import java.lang.reflect.*;  
@Retention(RetentionPolicy.RUNTIME) 
@interface MySingle { 
    int value();
} 
class Single { 
    @MySingle (100) 
    public static void myMeth() { 
    Single ob = new Single(); 
    try { 
        Method m = ob.getClass().getMethod("myMeth");
        MySingle anno = m.getAnnotation(MySingle.class); 
        System.out.println(anno.value()); 
    }catch (NoSuchMethodException exc) { 
        System.out.println("Method Not Found.");
        } 
    } 
    public static void main(String args[]) { 
        myMeth();
        System.out.println("Manish,B,10");
    } 
}
