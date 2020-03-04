/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

 import java.util.Scanner;
public class SwitchOperator {
 

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter first number:");
int n1=sc.nextInt();
System.out.println("enter second number:");
int n2=sc.nextInt();
System.out.println("enter any operator:+,-,*,/");
char op=sc.next().charAt(0);
int result=0;
switch(op){
case '+':
result=n1+n2;
break;
case '-':
result=n1-n2;
break;
case '*':
result=n1*n2;
break;
case'/':
result=n1/n2;
break;
default:
System.out.println("invalid number");
}
System.out.println("result="+result);
System.out.println("Manish,10,B");
}
}
  

