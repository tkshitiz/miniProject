/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

  import java.io.*; 

 class Demos implements Serializable{ 
    int i =10;   
    double d = 55.77; 
    String s = "Hello"; 
} 
public class serialization { 
    public static void main(String[] args) throws Exception { 
        Demos obj = new Demos(); 
        //serialization  
        FileOutputStream fos = new FileOutputStream("D:/pqr.txt");   
        ObjectOutputStream oos = new ObjectOutputStream(fos);        
        oos.writeObject(obj); 
        System.out.println("Serializaion Completed");    
        //deserialization  
        FileInputStream fis = new FileInputStream("D:/pqr.txt");
        ObjectInputStream ois = new ObjectInputStream(fis); 
        Demos obj1= (Demos) ois.readObject(); 
        System.out.println("Deserialization completed "); 
        System.out.println("Values in the object"); 
        System.out.println("i = "+ obj1.i+" d= "+ obj1.d+ " s= "+obj1.s); 
    }     
} 
 

