/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public class MyCircle34 {
 final double PI=3.14;
    double r;
    void getRad()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of circle:");
        r=sc.nextDouble();
        
    }
    void circleArea()
    {
        double a=PI*r*r;
        System.out.println("Area of circle:"+a);
    }
    public static void main(String[] args)
    {
        MyCircle34 c1=new MyCircle34();
        c1.getRad();
        c1.circleArea();
         System.out.println("manish,10,B");
    }
   
}
