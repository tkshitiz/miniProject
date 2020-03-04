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
public class ExcepTest {
    public static void main(String[] args){
        int a[]=new int[2];
        try{
            System.out.println("access element three:"+a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("exception thrown:"+e);
        }
        finally{
            a[0]=6;
            System.out.println("first element value "+a[0]);
            System.out.println("the finally statement is executed");
        }
        System.out.println("manish,10,B");
    }
}
