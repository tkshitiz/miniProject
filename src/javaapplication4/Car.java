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
public class Car {
    public Car(){
    System.out.println("class car");
    
    }
    public void vehicleType() 
   { 
 	System.out.println("Vehicle Type: Car"); 
   } 
} 
class Maruti extends Car{  
    public Maruti() 
   { 
 	System.out.println("Class Maruti"); 
   } 
   public void brand() 
   { 
 	System.out.println("Brand: Maruti"); 
   } 
   public void speed() 
   { 
 	System.out.println("Max:90Kmph"); 
   } 
}

 class  Maruti800 extends Maruti{ 
 
   public Maruti800() 
   { 
 	System.out.println("Maruti Model: 800"); 
   } 
   public void speed() 
   { 
 	System.out.println("Max: 80Kmph"); 
   } 
   public static void main(String args[]) 
   { 
 	 Maruti800 obj=new Maruti800(); 
 	 obj.vehicleType();  	 
         obj.brand();  	 
         obj.speed(); 
         System.out.println("babita,B,04");
   } 
} 
