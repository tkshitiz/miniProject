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
public class BreakWithLabel {
   
   
public static void main(String[] args){
    outer: 
    for(int i=1;i<3;i++)
    {
        System.out.println("i="+i);
      
    
    inner:
    for(int j=1;j<10;j++)
    {
        if(j==5)
            break outer;
          System.out.println("j="+j);
        
    }
    }
      System.out.println("Manish,10,B");
}    
}


