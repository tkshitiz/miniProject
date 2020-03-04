/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public class ScannerDemo {


            

  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     String name;
     int age;
     double salary;
      System.out.println("enter your name:");
      name= sc.nextLine();
       System.out.println("enter your age:");
       age=sc.nextInt();
        System.out.println("enter your salary:");
        salary=sc.nextDouble();
       
         System.out.println("your details:");
          System.out.println("your name is:"+name);
           System.out.println("your age is:"+age);
            System.out.println("your salary is:"+salary);
             System.out.println("kshitiz,Rollno:09,Sec:'B'");
      }
}
   

