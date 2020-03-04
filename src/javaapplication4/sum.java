/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public class sum {
        int sum_Kshitiz(int n,int result){
        if(n==1)
        return result+1;
        else
        return(sum_Kshitiz(n-1, n+result));
    }
}
class SumDemos{
    public static void main(String args[]){
        Scanner sc_Kshitiz=new Scanner(System.in);
        sum s_Kshitiz=new sum();
        System.out.print("Enter a number ");
        int n=sc_Kshitiz.nextInt();
        System.out.println("Sum is "+s_Kshitiz.sum_Kshitiz(n,0)+"using tsil recursion.");
        System.out.println("Kshitiz,B,08");
    }

}
