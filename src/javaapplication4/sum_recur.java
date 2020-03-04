/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public class sum_recur {
      int sum_Kshitiz(int n){
        int result;
        if(n==1)
            return 1;
        result=n+sum_Kshitiz(n-1);
        return result;
    }
}
class SumDemo{
    public static void main(String args[]){
        Scanner sc_Kshitiz=new Scanner(System.in);
       sum_recur s_Kshitiz=new sum_recur();
        System.out.print("Enter a number ");
        int n=sc_Kshitiz.nextInt();
        System.out.println("Sum is "+s_Kshitiz.sum_Kshitiz(n));
        System.out.println("Kshitiz,B,08");
    }
  
}
