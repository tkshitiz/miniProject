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

    enum Days{
SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
  public class EnumDemo1 {
    public static void main(String[] args) {
        Days ds;
        System.out.println("Here are all Days constants ");
        Days allDays[]=Days.values();
        for(Days d:allDays){
            System.out.println(d);
        }
        System.out.println("###################");
        ds=Days.valueOf("TUESDAY");
        System.out.println("ds contains:"+ds);
        System.out.println("manish,B,10");
    }	
}


