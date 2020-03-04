/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;


public class OddForLoop {
  
public static void main(String[] args){
int n=1,sum=0;
int oddarray[]=new int[50];
for(int i=1;i<50;i++){
oddarray[i]=n;
n=n+2;
}
for(int i=1;i<50;i++){
sum=sum+oddarray[i];
}
System.out.println("sum 0f all elements="+sum);
System.out.println("kshitiz thapa,rollno:09");
}
}
  

