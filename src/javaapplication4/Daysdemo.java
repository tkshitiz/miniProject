//using buitin enumeration methods:values() and valueOf()
package javaapplication4;

/**
 *
 * @author dell
 */

enum days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class Daysdemo {
   public static void main(String[] args){
       days ds;
       System.out.println("here are all days constants");
       days alldays[]=days.values();
       for(days d:alldays){
           System.out.println(d);
       }
       System.out.println("##########");
       ds=days.valueOf("TUESDAY");
       System.out.println("Ds contains"+ds);
   } 
}
