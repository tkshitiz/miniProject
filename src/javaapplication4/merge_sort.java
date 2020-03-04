/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
  import java.util.Scanner;

 
class MergeSort{  
    void merge(int Kshitiz[], int l, int m, int r)  { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = Kshitiz[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = Kshitiz[m + 1+ j]; 
        int i = 0, j = 0; 
        int k = l; 
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j])  { 
                Kshitiz[k] = L[i]; 
                i++; 
            } else { 
                Kshitiz[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1)  { 
            Kshitiz[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2)  { 
            Kshitiz[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
    void sort(int Kshitiz[], int l, int r)  { 
        if (l < r) {  
            int m = (l+r)/2; 
            sort(Kshitiz, l, m); 
            sort(Kshitiz , m+1, r); 
            merge(Kshitiz, l, m, r); 
        } 
    } 
    static void printArray(int Kshitiz[])  { 
        int n = Kshitiz.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(Kshitiz[i] + " "); 
        System.out.println(); 
    } 
    public static void main(String args[])   { 
        Scanner scan = new Scanner(System.in);    
       System.out.print("Enter Array Size : ");  
       int size_Kshitiz= scan.nextInt(); 
       int Kshitiz[] = new int[size_Kshitiz]; 
       System.out.print("Enter Array Elements : ");  
       for(int i=0; i<size_Kshitiz; i++){  
           Kshitiz[i] = scan.nextInt();  
       } 
        System.out.println("Given Array"); 
        printArray(Kshitiz); 
        MergeSort ob_Kshitiz = new MergeSort(); 
        ob_Kshitiz.sort(Kshitiz, 0, Kshitiz.length-1); 
        System.out.println("\nSorted Array"); 
        printArray(Kshitiz); 
        System.out.println("Kshitiz,B,8");
    } 
}


