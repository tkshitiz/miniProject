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
public class BubbleSort {
   

    void bubbleSort(int Kshitiz[]){ 
        int n = Kshitiz.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (Kshitiz[j] > Kshitiz[j+1]) 
                { 
                    int temp = Kshitiz[j]; 
                    Kshitiz[j] = Kshitiz[j+1]; 
                    Kshitiz[j+1] = temp; 
                } 
    } 
    void printArray(int Kshitiz[]) { 
        int n = Kshitiz.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(Kshitiz[i] + " "); 
        System.out.println(); 
    } 
    public static void main(String args[]) { 
       Scanner scan = new Scanner(System.in);    
       System.out.print("Enter Array Size : ");  
       int size_Kshitiz= scan.nextInt(); 
       int Kshitiz[] = new int[size_Kshitiz]; 
       System.out.print("Enter Array Elements : ");  
       for(int i=0; i<size_Kshitiz; i++){  
           Kshitiz[i] = scan.nextInt();  
       } 
        BubbleSort ob_Kshitiz = new BubbleSort(); 
        System.out.print("Array are :\n"); 
        for (int i = 0; i < size_Kshitiz; ++i){ 
            System.out.print(Kshitiz[i] + " ");
        }
        System.out.println(); 
        ob_Kshitiz.bubbleSort(Kshitiz); 
        System.out.println("Sorted Array"); 
        ob_Kshitiz.printArray(Kshitiz); 
        System.out.println("Kshitiz,B,0");
    } 
}


