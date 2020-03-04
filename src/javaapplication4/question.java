/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author dell
 */

  
public class Ademo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[7];
        for(int i=0;i<7;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println("Countries:");
        for(int i=0;i<7;i++){
                if(arr[i].endsWith("a")||arr[i].endsWith("e")||arr[i].endsWith("i")||arr[i].endsWith("o")||arr[i].endsWith("u")){
                  System.out.println(arr[i]);
                }
        
        }
    }
}  

