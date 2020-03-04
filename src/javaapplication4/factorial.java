/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public class factorial {
        int fact_Kshitiz(int n_Kshitiz){
        int result;
        if(n_Kshitiz==1)
            return 1;
        result=n_Kshitiz*fact_Kshitiz(n_Kshitiz-1);
        return result;
    }
}
class FactorialDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        factorial f_Kshitiz=new factorial();
        System.out.print("Enter a number ");
        int n_Kshitiz=sc.nextInt();
        System.out.println("Factorial of "+n_Kshitiz+" is "+f_Kshitiz.fact_Kshitiz(n_Kshitiz));
        System.out.println("Kshitiz,B,08");
    }

}
