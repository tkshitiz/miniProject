/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
 import java.util.Scanner;
import java.io.*;
/**
 *
 * @author dell
 */

   

public class File11 implements Serializable {
    String name,address;
    int phone_no,i;

  
    
    void getdata(){
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){
    System.out.println("Enter the name");
    name=sc.nextLine();

    System.out.println("Enter the address");
    address=sc.nextLine();
   
    System.out.println("Enter the phone no");
     phone_no=sc.nextInt();
       
    }
    
       System.out.println("File write complete.");
    }
   
    public static void main(String[] args)throws Exception{
        File11 a = new File11();
        FileOutputStream fos=new FileOutputStream("D:/college.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a);
        fos.close();
        oos.close();
        a.getdata();
       
        FileInputStream foos=new FileInputStream("D:/college.txt");
        ObjectInputStream ooos=new ObjectInputStream(foos);
        File11 f1=(File11)ooos.readObject();
      
             System.out.println("name "+f1.name+"address: "+f1.address);
    }
}



