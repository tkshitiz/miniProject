/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

 import java.util.Scanner;
public class SumuntilN {
  

   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
     int n;
     char c;
     int sum=0;
     while(true)
     {
         System.out.print("enter a number:");
         n=sc.nextInt();
         sum=sum+n;
         System.out.print("another number?(Y/N)");
         c=sc.next().charAt(0);
         if(c=='N'||c=='n')
         {
             break;
             
         }
     }
     System.out.println("the sum of numbers="+sum);
     System.out.println("Manish,10,B");
   }
           
}
 

