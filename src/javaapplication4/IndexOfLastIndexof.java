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
public class IndexOfLastIndexof {
       public static void main(String args[]){
        String s1="this is index of example";
        String s2 = "This is last index of example";
        System.out.println("indexOf() Testing----");
        int index1=s1.indexOf("is");
        int index2=s1.indexOf("index");
        System.out.println(index1+" "+index2);
        int index3=s1.indexOf("is",4);
        System.out.println(index3);
        int index4=s1.indexOf('s');
        System.out.println(index4);
        System.out.println("lastIndexOf() Testing-------");
        int index5 = s2.lastIndexOf("ex");
        System.out.println(index5); 
        int index6=s2.lastIndexOf('s');
        System.out.println(index6);
        int index7 = s2.lastIndexOf("ple",10);
        System.out.println(index7);
        System.out.println("Manish,B,10");
    }
 
}
