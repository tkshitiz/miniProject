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
 class father {
    void property()
    {
        System.out.println("all of my property willbe of my son!");
    }
    void marriage()
    {
       System.out.println("my son must do arrange marriage"); 
    }
}
public class Son extends father{
    void marriage()
    {
        System.out.println("love marriage");
    }
    void  displayparentmethod()
    {
        System.out.println("marriage in parent calss");
     super.marriage(); 
       
        
    }
            
     public static void main(String[] args)
     {
     
        Son s= new Son();
        s.property();
        s.marriage();
        System.out.println("defination  of marriage method in parent class");
    System.out.println("babita,B,04");
    }
     
     
}