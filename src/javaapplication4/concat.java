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
public class concat {
       public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Java";
        String str3 = "Lovers";
        String str4 = str1.concat(str2);
        System.out.println(str4);
        String str5 = str1.concat(str2).concat(str3);
        System.out.println(str5);
        String str6 = str1.concat(" ").concat(str2).concat("").concat(str3);
        System.out.println(str6);
        String str7 = str1.concat("!");
        System.out.println(str7);
        System.out.println("manish,B,10");
    }
 
}
