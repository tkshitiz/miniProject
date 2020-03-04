/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public  class fibo {
    static int fibo(int n){
        if(n==1)
        {
            return 1;
        }
        else if(n==2){
           return 2; 
        }
        else{
             return fibo((n-1)+(n-2));
        }
        
   }

   public static void main(String[] args) throws Exception{
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number");
       int num=sc.nextInt();
       fibo f=new fibo();
       for(int i=1;i<num;i++){
         
           System.out.println("fibonacci series is"+f.fibo(i));
       }
   }
}
