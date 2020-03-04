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
public class StringToCharArrayDemo {
        public static void main(String[] args) {
        String s1 = "Namaskar hajur";
        char[] ch = s1.toCharArray();
        int len = ch.length;
        System.out.println("Char Array length: " + len);
        System.out.println("Char Array elements: ");
        for (int i = 0; i < len; i++) {
            System.out.print(ch[i]);
            System.out.print("\t");
        }
        System.out.print("\n");
        System.out.println("Manish,B,10");
    }

}
