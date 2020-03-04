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
public class GetBytesExample {
  public static void main(String[] args) {
        String s1 = "ABCD HAHAHA";
        byte[] barr = s1.getBytes();
        for(int i=0;i<barr.length;i++){
            System.out.println(barr[i]);
        }
        String s2 = new String(barr);
        System.out.println(s2);
        System.out.println("Manish,B,10");
  }  
}
