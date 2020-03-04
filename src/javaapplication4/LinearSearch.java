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
public class LinearSearch {
    public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){  
        Scanner sc_Kshitiz=new Scanner(System.in);
        System.out.println("Enter size of Array elements:");
        int n=sc_Kshitiz.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in array:");
        for(int i=0;i<n;i++){
            arr[i]=sc_Kshitiz.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int key=sc_Kshitiz.nextInt();  
        System.out.println(key+" is found at location: "+(linearSearch(arr, key)+1)+ "using linear search.");    
        System.out.println("Kshitiz thapa,B,08");
    }    

}
