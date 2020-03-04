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
import java.util.Scanner;
public class QuickSort {
        int partition(int Kshitiz[], int low, int high)  { 
        int pivot = Kshitiz[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) { 
            if (Kshitiz[j] <= pivot) 
            { 
                i++; 
                int temp = Kshitiz[i]; 
                Kshitiz[i] = Kshitiz[j]; 
                Kshitiz[j] = temp; 
            } 
        } 
        int temp = Kshitiz[i+1]; 
        Kshitiz[i+1] = Kshitiz[high]; 
        Kshitiz[high] = temp; 
        return i+1; 
    } 
    void sort(int Kshitiz[], int low, int high)  { 
        if (low < high){ 
            int pi = partition(Kshitiz, low, high); 
            sort(Kshitiz, low, pi-1); 
            sort(Kshitiz, pi+1, high); 
        } 
    } 
    static void printArray(int Kshitiz[]) { 
        int n = Kshitiz.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(Kshitiz[i]+" "); 
        System.out.println(); 
    } 
    public static void main(String args[])  { 
        Scanner scan = new Scanner(System.in);    
       System.out.print("Enter Array Size : ");  
       int size_Kshitiz= scan.nextInt(); 
       int Kshitiz[] = new int[size_Kshitiz]; 
       System.out.print("Enter Array Elements : ");  
       for(int i=0; i<size_Kshitiz; i++){  
           Kshitiz[i] = scan.nextInt();  
       } 
         System.out.print("Array are :\n"); 
        for (int i = 0; i < size_Kshitiz; ++i){ 
            System.out.print(Kshitiz[i] + " ");
        }
        System.out.println(); 
        QuickSort ob_Kshitiz = new QuickSort(); 
        ob_Kshitiz.sort(Kshitiz, 0, size_Kshitiz-1); 
        System.out.println("Sorted Array using bubble sort"); 
        printArray(Kshitiz); 
        System.out.println("Kshitiz,B,08");
    } 

}
