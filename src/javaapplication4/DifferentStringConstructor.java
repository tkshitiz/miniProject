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

  public class DifferentStringConstructor {
    public static void main(String[] args){
        String s1=new String();
        s1=("Value Adding in String");
        System.out.println(s1);
        char ch[]={'h','e','l','l','o'};
        String s2=new String(ch);
        System.out.println(s2);
        char c[]={'m','o','n','k','e','y'};
        String s3=new String(c,1,4);
        System.out.println(s3);
        String s4=new String(s3);
        System.out.println(s4);
        char a[]={65,75,89,90,72,87};
        String s5=new String(a);
        System.out.println(s5);
        String s6=new String(a,2,3);
        System.out.println(s6);
        System.out.println("Manish,B,10");
    }
}
 
