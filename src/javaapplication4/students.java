/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
import java.io.*;
class students implements Serializable {
    String name;
    int roll;
    float marks;
    File f=new File("E:/student.txt");
    void getdata(){
        Scanner sc=new Scanner(System.in);
            System.out.println("enter student name");
            roll=sc.nextInt();
            System.out.println("enter roll of students:");
            roll=sc.nextInt();
            System.out.println("enter marks:");
            marks=sc.nextFloat();
    
    }
    void writetofile(students s)throws Exception{
        FileOutputStream  fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        fos.close();
        oos.close();
        System.out.println("writing completed");
      
    }
    void readFromFile()throws Exception{
    FileInputStream  fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        students s1=(students)ois.readObject();
        System.out.println("Name="+s1.name);
        System.out.println("roll="+s1.roll);
        System.out.println("marks="+s1.marks);
        fis.close();
        ois.close();
        System.out.println("reading from file reading is complete");
                
    }
}
class answer{
    public static void main(String[] args){
        students obj=new students();
        obj.getdata();
        try{
            obj.writetofile(obj);
              obj.readFromFile();
        }
        catch(Exception e){
            System.out.println("problem"+e);
        }
    }
}