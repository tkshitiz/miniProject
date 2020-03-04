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

import java.io.*; 
class Demoss implements Serializable{ 
    int i =10;     double d = 55.77; 
    String s = "Hello"; 
} 
public class SerDeserDemo { 
    public static void main(String[] args) throws Exception { 
        Demo obj = new Demo(); 
        //serialization  
        FileOutputStream fos = new FileOutputStream("E:/pqr.txt");         ObjectOutputStream oos = new ObjectOutputStream(fos);         oos.writeObject(obj); 
        System.out.println("Serialization Completed");    
        //deserialization  
        FileInputStream fis = new FileInputStream("E:/pqr.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        Demo obj1= (Demo) ois.readObject(); 
        System.out.println("Deserialization completed "); 
         
        System.out.println("Values in the object"); 
        System.out.println("i = "+ obj1.i+" d= "+ obj1.d+ " s= "+obj1.s); 
    } 
     
} 
