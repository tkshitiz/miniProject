//working with static keyword
//static variables

package javaapplication4;

/**
 *
 * @author dell
 */
public class Counter33 {
   static int count=0;
 Counter33()
 {
     count=count+1;
     System.out.println("value of count="+count);
 }
 public static void main(String[] args){
     Counter33 c1=new Counter33();
      Counter33 c2=new Counter33();
       Counter33 c3=new Counter33();
 }
         
}
