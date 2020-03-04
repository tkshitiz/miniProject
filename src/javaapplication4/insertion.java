/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public class insertion {
    { 
    void sort(int Kshitiz[]) 
 { 
        int n = Kshitiz.length; 
        for (int i = 1; i < n; ++i)
 { 
            int key = Kshitiz[i]; 
            int j = i - 1; 
            while (j >= 0 && Kshitiz[j] > key)
 { 
                Kshitiz[j + 1] = Kshitiz[j]; 
                j = j - 1;	
} 
            Kshitiz[j + 1] = key; 
        }	 
 } 
    static void printArray(int Kshitiz[]) 
 { 
        int n = Kshitiz.length;
        System.out.print("Now the Array after Sorting is :\n"); 
        for (int i = 0; i < n; ++i) {
            System.out.print(Kshitiz[i] + " ");
}
        System.out.println(); 
    } 
    public static void main(String args[]) 
{
        Scanner scan = new Scanner(System.in);    
       System.out.print("Enter Array Size : ");  
       int size_Kshitiz= scan.nextInt(); 
       int Kshitiz[] = new int[size_Kshitiz]; 
       System.out.print("Enter Array Elements : ");  
       for(int i=0; i<size_Kshitiz; i++)
{  
           Kshitiz[i] = scan.nextInt();    
 } 
        System.out.print("Array are :\n"); 
        for (int i = 0; i < Kshitiz.length; ++i)
{ 
            System.out.print(Kshitiz[i] + " ");   
}
        System.out.println(); 
        InsertionSort ob_Kshitiz = new InsertionSort(); 
        ob_Kshitiz.sort(Kshitiz); 
        printArray(Kshitiz); 
        System.out.println("Kshitiz,B,10");
    } 	
}


