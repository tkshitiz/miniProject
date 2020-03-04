/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

   import java.util.Scanner;

public class ArrayPassedRoll {

    
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a roll no of passed students:");
int n=sc.nextInt();
int passedRoll[]={1,2,3,5,9,10,15};
boolean result=false;
for(int r:passedRoll)
{
if(r==n)
{
result=true;
break;

}
}
if(result)
System.out.println("you are pass");
else
System.out.println("you are fail");
System.out.println("Manish,10,B");
}
}
 

