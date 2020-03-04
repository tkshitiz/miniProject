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
public class Student24 {
        int roll;
    String name;
    void SetValues(int r,String n){
        roll=r;
        name=n; 	}
    void Display(){
        System.out.println("Name= "+name);
        System.out.println("Roll no.= "+roll);
    }
     public static void main(String[] args){
         Student24 s1=new Student24();
         Student24 s2=new Student24();
         s1.SetValues(1,"Ram");
         s2.SetValues(2,"Shyam");
         System.out.println("In object s1");
         s1.Display();
         System.out.println("In object s2");
         s2.Display();
         System.out.println("manish,B,10");
    }

}
