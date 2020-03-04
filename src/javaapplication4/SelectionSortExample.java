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
public class SelectionSortExample {
       public static void main(String args[]) {  
       int size_Kshitiz, i, j, temp;  
       int Kshitiz[] = new int[50];  
       Scanner scan = new Scanner(System.in);    
       System.out.print("Enter Array Size : ");  
       size_Kshitiz = scan.nextInt();  
       System.out.print("Enter Array Elements : ");  
       for(i=0; i<size_Kshitiz; i++){  
           Kshitiz[i] = scan.nextInt();  
       }
       System.out.print("Array are :\n"); 
        for (i = 0; i < size_Kshitiz;i++){ 
            System.out.print(Kshitiz[i] + " ");
        }
        System.out.println();
       for(i=0; i<size_Kshitiz; i++) {  
           for(j=i+1; j<size_Kshitiz; j++){  
               if(Kshitiz[i] > Kshitiz[j]) {  
                   temp = Kshitiz[i];  
                   Kshitiz[i] = Kshitiz[j];  
                   Kshitiz[j] = temp;  
               }          }      }
       System.out.print("Now the Array after Sorting is :\n");  
       for(i=0; i<size_Kshitiz; i++){  
           System.out.print(Kshitiz[i]+ "  ");  
       }
       System.out.println();
       System.out.println("Kshitiz,B,08");
   }  	

}
