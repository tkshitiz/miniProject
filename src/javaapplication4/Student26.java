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
public class Student26 {
       int roll;
    double fee;
    String name;
    Student26(int r,double f,String n){
        roll=r;
        fee=f;
        name=n;
    }
    public static void main(String[] args){
        Student26 s1=new Student26(15,153.56,"kshitiz");
        System.out.println("Roll no is="+s1.roll);
        System.out.println("Fee is="+s1.fee);
        System.out.println("Name is="+s1.name);
        Student26 s2=new Student26(16,200,"Ram");
        System.out.println("Roll no is="+s2.roll);
        System.out.println("Fee is="+s2.fee);
        System.out.println("Name is="+s2.name);
        System.out.println("kshitiz,B,09");
    }
}
 

