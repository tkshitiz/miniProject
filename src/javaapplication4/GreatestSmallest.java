/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

   import java.util.Scanner;
public class GreatestSmallest {


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
int s=0,g=0;
if(num1<num2&&num1<num3)
s=num1;
if(num2<num1&&num2<num3)
s=num2;
if(num3<num1&&num3<num2)
s=num3;
if(num1>num2&&num1>num3)
g=num1;
if(num2>num1&&num2>num3)
g=num2;
if(num3>num1&&num3>num2)
g=num3;
System.out.println("the smallest number is:"+s);
System.out.println("the greatest number is:"+g);


}
}

 

