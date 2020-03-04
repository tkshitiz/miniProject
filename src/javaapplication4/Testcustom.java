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
 class TestCustom {
    static void validate(int age)throws InvalidAgeException{
        if(age<0||age>150)
        throw new InvalidAgeException("invalid age ");
        else
        System.out.println("Welcome!");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try{
            validate(age);
        }
        catch(Exception m){
            System.out.println("Exception occured: "+m);
        }
        System.out.println("rest of the code...");
        System.out.println("babita,B,04");
    }
}



    
 class InvalidAgeException extends Exception{
    public InvalidAgeException(String s)
    {
        super(s);
    }
}

