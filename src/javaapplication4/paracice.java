/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

  import java.io.*; 
import java.util.Scanner; 
public class paracice {
   
    public static void main(String[] args) { 
    Scanner sc= new Scanner(System.in); 
    String inputData = ""; 
    System.out.println("Write whatever you like..type'exit' at last");  
    File myfile = new File("D:/lan.txt");      
   try(FileWriter fw = new FileWriter(myfile)) { 
            while(true){       
                
      inputData= sc.nextLine(); 
                        
            if(inputData.equalsIgnoreCase("exit")) 
                break;                           
            fw.write(inputData);            
                 
            } 
        System.out.println("Thank you ! Your data has been saved to 'E:/xyz.txt'"); 
        }   
   catch(IOException ioe){ 
        System.out.println("I/O proble: "+ ioe); 
        } 
    } 
} 


