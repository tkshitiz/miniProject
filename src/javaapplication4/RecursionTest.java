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
public class RecursionTest {
    int value[];
     RecursionTest(int i){
        value=new int[i];
    }
    void printArray(int i){
        if(i==0)
            return;
        else
            printArray(i-1);
        System.out.println("["+(i-1)+"] "+value[i-1]);
    }
}
class Recursion2{
    public static void main(String[] args){
        RecursionTest ob=new RecursionTest(10);
        int i;
        for(i=0;i<10;i++)
            ob.value[i]=i;
        ob.printArray(10);
         System.out.println("manish,B,10");
    }
}


