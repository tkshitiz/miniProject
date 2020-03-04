/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public class SortString {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String Name[]=new String[10];
        System.out.println("Enter 10 Names");
        for(int i=0;i<10;i++){
            System.out.print("Enter name: ");
            Name[i]=sc.nextLine();
        }
        for(int j = 0; j < Name.length; j++){
            for(int i = j + 1; i < Name.length; i++){ 
                if(Name[i].compareTo(Name[j]) < 0) {
                    String t = Name[j];
                    Name[j] = Name[i]; 
                    Name[i] = t; 
                }
            }
            System.out.println(Name[j]); 
        }
        System.out.println("Manish,B,10");
    }

}
