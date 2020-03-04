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
public class This {
    int rollno;   String name;   double  fee;   
This(int rollno,String name,double fee)
{   this.rollno=rollno;   this.name=name;   this.fee=fee;   
}   void display(){ 
System.out.println(rollno+" "+name+" "+fee);   
}   
   
public static void main(String args[]){   Student s1=new Student(111,"Ankit",5000);   Student s2=new Student(112,"Sumit",6000);   s1.display();   s2.display();   
} 

}
