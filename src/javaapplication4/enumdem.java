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

  enum DaysOfWeek{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
 class Ordinal_CompareTo_Eqals {
    public static void main(String[] args) {
        DaysOfWeek dow,dow2,dow3;
        System.out.println("Here are all DaysOfWeek constants with ordinal values");
        System.out.println("---------------------------");
        DaysOfWeek allDays[]=DaysOfWeek.values();
        for(DaysOfWeek d:allDays){
            System.out.println(d+"---->"+d.ordinal());
        }
        System.out.println("---------------------------");
        dow = DaysOfWeek.SATURDAY;
        dow2=DaysOfWeek.MONDAY;
        dow3=DaysOfWeek.SATURDAY;
        System.out.println("#########################");
        System.out.println("dow.compareTo(dow2)==>"+dow.compareTo(dow2));
        System.out.println("dow2.compareTo(dow)==>"+dow2.compareTo(dow));
        System.out.println("#########################");
        if(dow.compareTo(dow2)<0)
            System.out.println(dow +" comes before "+dow2);
        if(dow.compareTo(dow2)>0)
            System.out.println(dow2 +" comes before "+dow);
        if(dow.compareTo(dow3)==0)
        System.out.println(dow +" equals "+dow3);
        System.out.println("#########################");
        System.out.println("dow.equals(dow2)==>"+dow.equals(dow2));
        System.out.println("dow.equals(dow3)==>"+dow.equals(dow3));
        System.out.println("#########################");
        if(dow.equals(dow2))
            System.out.println("Error!");
        if(dow.equals(dow3))
            System.out.println(dow+" equals "+dow3);
        if(dow == dow3)
            System.out.println(dow+" == "+dow3);
        System.out.println("manish,B,10");
    }	}
  

