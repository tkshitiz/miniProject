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
public class throwdemo {
    static void demoprac(){
        try{
            throw new NullPointerException ("demo");
        }
        catch(NullPointerException e){
            System.out.println("caught inside demoprac");
            throw e;
        }
    }
    public static void main(String[] args){
        try{
            demoprac();
        }
        catch(NullPointerException e){
             System.out.println("recaught"+e);
             
        }
         System.out.println("babita,04,B");
    }
}
