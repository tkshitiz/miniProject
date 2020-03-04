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
 import java.util.*; 
 class randomized_quick_sort {
   
   
    public static int N = 5; 
    public static int[] arr = new int[N]; 
      
    void random(int low,int high) 
    { 
      
        Random kshitiz= new Random(); 
        int pivot = kshitiz.nextInt(high-low) + low; 
          
        int temp1=arr[pivot]; 
        arr[pivot]=arr[high]; 
        arr[high]=temp1; 
    } 
      
    int partition(int arr[], int low, int high)  
    {  
        int pivot = arr[high];  
      
  
        int i = (low-1);   
        for (int j = low; j < high; j++)  
        {  
            if (arr[j] <= pivot)  
            {  
                i++;  
  
             
                int temp = arr[i];  
                arr[i] = arr[j];  
                arr[j] = temp;  
            }  
        }  
  
         
        int temp = arr[i+1];  
        arr[i+1] = arr[high];  
        arr[high] = temp;  
  
        return i+1;  
    }  
 
    void sort(int arr[], int low, int high)  
    {  
        if (low < high)  
        {  
            
            int pi = partition(arr, low, high);  
  
            sort(arr, low, pi-1);  
            sort(arr, pi+1, high);  
        }  
    }  
  
    static void printArray(int arr[])  
    {  
        int n = arr.length;  
        for (int i = 0; i < n; ++i)  
            System.out.print(arr[i]+" ");  
        System.out.println();  
    }  
  
 
    public static void main(String args[])  
    {  
        int arr[] = {10, 7, 8, 9, 1, 5};  
        int n = arr.length;  
  
        randomized_quick_sort ob = new randomized_quick_sort ();  
        ob.sort(arr, 0, n-1);  
  
        System.out.println("sorted array");  
        printArray(arr);  
        System.out.println("kshitiz,B,8");
    }  
}  

