/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author dell
 */
public class ForLoopExample3 {
        public static void main(String args[]){
        int oddArray[]=new int[50];
        int n=1,sum=0;
        for(int i=1;i<50;i++)
        {
            oddArray[i]=n;
            n=n+2;
        }
        for(int i=1;i<50;i++)
        {
            sum=sum+oddArray[i];
        }
        System.out.println("Sum of Odd element between 1-100= "+sum);
        System.out.println("Manish,10,B");
    }

}
