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
class school{
    String name;
    school(String n)
    {
        this.name=n;
    }
}
    class Teacher{
        double salary;
        int tid;
        Teacher(int tid,double salary)
        {
            this.tid=tid;
            this.salary=salary;
        }
    }
   
      
    
public class SameMethod {
  public static void main(String[] args){
      school s1=new school("My school");
      school s2=new school("My school");
      Teacher t1=new Teacher(1,5000.0);
      System.out.println("to check s1 and s2 are equal or not");
      boolean b=s1.equals(s2);
      if(b)
          System.out.println("they are equal");
      else
          System.out.println("they are not equal");
          System.out.println("To get the class of object ");
          System.out.println("The class of object t1 is="+t1.getClass());
          System.out.println("babita04,B");
  }    
}
