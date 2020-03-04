/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

enum daysOfWeek{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class ordinalCompareToEquals {
  public static void main(String[] args){
      daysOfWeek dow,dow2,dow3;
      System.out.println("here are all daysof week constants with ordinal values");
      daysOfWeek alldays[]=daysOfWeek.values();
      for(daysOfWeek d:alldays)
      {
          System.out.println(d+"--->"+d.ordinal());
         
      }
      dow=daysOfWeek.SATURDAY;
      dow2=daysOfWeek.MONDAY;
      dow3=daysOfWeek.SATURDAY;
      System.out.println("dow.compareTO(dow2)"+dow.compareTo(dow2));
      System.out.println("dow2.compareTo(dow)==>"+dow2.compareTo(dow));
      if(dow.compareTo(dow2)<0)
          System.out.println(dow+"comes before"+dow2);
      if(dow.compareTo(dow2)>0)
          System.out.println(dow2+"comes before"+dow);
      if(dow.compareTo(dow3)==0)
      System.out.println(dow+"equals"+dow3);
      System.out.println("dow.equals(dow2)==>"+dow.equals(dow2));
      System.out.println("dow.equals(dow3)==>"+dow.equals(dow3));   
  }
  
}





