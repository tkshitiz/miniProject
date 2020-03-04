/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public class tail_fibo {
       int fibo_Kshitiz(int n_Kshitiz){
        int result;
        if(n_Kshitiz<=1){
            return n_Kshitiz;
        }
        else{
        return(fibo_Kshitiz(n_Kshitiz-1)+fibo_Kshitiz(n_Kshitiz-2));
        }
    } 
}
class Fibonacci_Demo{
    public static void main(String args[]){
        Scanner sc_Kshitiz=new Scanner(System.in);
         tail_fibo f_Kshitiz=new  tail_fibo();
        System.out.print("Enter a number: ");
        int n=sc_Kshitiz.nextInt();
        System.out.println("Fibonacci series for "+n+" elements: ");
        for(int i=1;i<=n;i++){
            System.out.println(f_Kshitiz.fibo_Kshitiz(i));
        }
        System.out.println("Kshitiz,B,08");
    }
 
}
