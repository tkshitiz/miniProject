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

    import java.util.Scanner;
public class toCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sentence=null;
        System.out.print("Enter a sentence:");
        sentence=sc.nextLine();
        int count=0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)=='e'){
                count++;
            }
        }
        System.out.println("Numbers of e in sentence= "+count);
        System.out.println("Manish,B,10");
    }
}



