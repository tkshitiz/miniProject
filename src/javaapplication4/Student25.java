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
public class Student25 {
    
    int roll;
    double fee;
    String name;
    Student25(){
        System.out.println("Object has been created");
        roll=5;
        fee=575.5;
        name="manish";	}
    public static void main(String[] args){
        Student25 s1=new Student25();
        System.out.println("Roll no is="+s1.roll);
        System.out.println("Fee is="+s1.fee);
        System.out.println("Name is="+s1.name);
        Student25 s2=new Student25();
        System.out.println("Roll no is="+s2.roll);
        System.out.println("Fee is="+s2.fee);
        System.out.println("Name is="+s2.name);
        System.out.println("manish,B,10");
    }	}


