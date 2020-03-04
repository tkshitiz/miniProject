/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public class PracticeMyself {
    public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
 int num=sc.nextInt();
 if(num>=10 && num<100){
    System.out.println("it is two digit number.");
}
    else if(num>=100&&num<1000)
            {
            System.out.println("itis three digit number.");
            

            }
    
    else
    System.out.println("not asked acc to the question:");
}
  
}
