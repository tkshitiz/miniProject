/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public class Smallest {
  

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1<num2 && num1<num3)
            System.out.println(num1+" is Smallest number.");
        else if(num2<num1 && num2<num3)
            System.out.println(num2+" is Smallest number.");
        else
            System.out.println(num3+" is Smallest number.");
        System.out.println("Manish,10,B");
    }
    
}
  

