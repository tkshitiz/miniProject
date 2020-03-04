/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
  import java.util.Scanner;

public class SwitchExample {
 
	

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a week from 0-7");
         int week=sc.nextInt();
         String day;
        
         switch(week){
             case 1:
                 day="sunday";
                 break;
             case 2:
                 day="monday";
                 break;
                 case 3:
                 day="tuesday";
                 break;
                 case 4:
                 day="wednesday";
                 break;
                 case 5:
                 day="thursday";
                 break;
                 case 6:
                 day="friday";
                 break;
                 case 7:
                 day="saturday"; 
                  break;
                 default: 
                         day="invalid day";
         }
       System.out.println("day="+day);   
         System.out.println("manish,10,B");  
   }    
}
 

