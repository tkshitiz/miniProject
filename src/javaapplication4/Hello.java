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
public class Hello {
 public static void main(String[] args) {
     int arr[]=new int[10];
     for(int i=0;i<arr.length;i++)
     {
         arr[i]=i+1;
         
     }
     for(int y:arr){
        System.out.println(y); 
    
     }
         
     
    
 }  
}
