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
public class RegionMatchesExample {
   public static void main(String[] args){
       String str1=new String("hello,how are you");
       String  str2=new String("how");
       String str3=new String("HOW");
       System.out.println("result os test1" );
        System.out.println(str1.regionMatches(7, str2, 0, 3));
         System.out.println("result of test2");
          System.out.println(str1.regionMatches(7, str3, 0, 3));
           System.out.println("result os test3" );
            System.out.println(str1.regionMatches(true,7,str3,0,3));
            System.out.println("manish,B,10");
   }
           
}
