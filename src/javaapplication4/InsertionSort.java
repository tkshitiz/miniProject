/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public class InsertionSort {
     

    void sort_by_kshitiz(int kshitiz[]) 
    { 
        int n = kshitiz.length; 
        for (int i = 1; i < n; ++i) { 
            int k = kshitiz[i]; 
            int j = i - 1; 
  
           
            while (j >= 0 && kshitiz[j] > k) { 
                kshitiz[j + 1] = kshitiz[j]; 
                j = j - 1; 
            } 
            kshitiz[j + 1] = k; 
        } 
    } 
  
   
    static void printArray_by_kshitiz(int kshitiz[]) 
    { 
        int n = kshitiz.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(kshitiz[i] + " "); 
  
        System.out.println(); 
    } 
  
    public static void main(String args[]) 
    { 
        int kshitiz[] = { 12, 11, 13, 5, 6 }; 
  
        InsertionSort ob = new InsertionSort(); 
        ob.sort_by_kshitiz(kshitiz); 
  
        printArray_by_kshitiz(kshitiz); 
        System.out.println("kshitiz ,B,8");
    } 

    void sort(int[] Kshitiz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}