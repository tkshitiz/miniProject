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
public class Bank33 {
     static long phone_no=5555; 
      int staff_id;
      static void change(long p)
      {
          phone_no=p;
        // staff_id=5;
          
      }
      public static void main(String[] args){
          System.out.println("pnone no:"+Bank33.phone_no);
          System.out.println("calling change method");
          Bank33.change(4444);
          System.out.println("pnone no after change is called="+Bank33.phone_no);
         Bank33 ob=new Bank33();
         ob.staff_id=5;
         System.out.println("staff id="+ob.staff_id);
      }
}




