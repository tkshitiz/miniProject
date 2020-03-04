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
public class NestedForLoopExample {
  public static void main(String args[]){
    int arr[][]=new int[3][5];
    for(int i=0;i<3;i++){
        for(int j=0;j<5;j++){
            arr[i][j]=(i+1)*(j+1);
        }
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<5;j++){
            System.out.print(arr[i][j]);
            System.out.print("\t");
        }
        System.out.println();
    }
    System.out.println("Manish,10,B");
    }
  
}
