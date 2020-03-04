/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

public class StartsWithEndsWith {
    public static void main(String[] args) {
        String str = "What are you doing?";
        System.out.println(str+ " , starts with 'What' --> "+str.startsWith("What"));
        System.out.println(str+ " , starts with 'hat' --> "+str.startsWith("hat"));
        System.out.println(str+ " , ends with 'you' --> "+str.startsWith("you"));
        System.out.println(str+ " , ends with 'What' --> "+str.startsWith("doing?"));
        System.out.println("Manish,B,10");
    }

}
