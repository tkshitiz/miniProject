/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public class SelectionSort {
       public static void main(String args[]) {  
       int size, i, j, temp;  
       int kshitiz[] = new int[50];  
       Scanner scan = new Scanner(System.in);    
       System.out.print("Enter Array Size : ");  
       size = scan.nextInt();  
       System.out.print("Enter Array Elements : ");  
       for(i=0; i<size; i++){  
           kshitiz[i] = scan.nextInt();  
       }
         
       System.out.print("Array are :\n"); 
        for (i = 0; i < size;i++){ 
            System.out.print(kshitiz[i] + " ");
        }
        System.out.println();
       for(i=0; i<size; i++) {  
           for(j=i+1; j<size; j++){  
               if(kshitiz[i] > kshitiz[j]) {  
                   temp = kshitiz[i];  
                   kshitiz[i] = kshitiz[j];  
                   kshitiz[j] = temp;  
               }  
           }  
       }
       System.out.print("Now the Array after Sorting is :\n");  
       for(i=0; i<size; i++){  
           System.out.print(kshitiz[i]+ "  ");  
       }
       System.out.println();
       System.out.println("Kshitiz,B,8");
   }  
}   

}
