/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;



import java.awt.*;
	
public class CheckBoxDemo {
  CheckBoxDemo()
	     { 
	    Checkbox cb1,cb2,cb3;
            Frame f=new Frame("CheckBoxDemo");
            Label l=new Label("choose the language you like");
            l.setBounds(100,50,200,20);
            
            
		 cb1= new Checkbox ("C++");
                 cb1.setBounds(100,100,50,50);
                 cb2= new Checkbox ("java",true);
                 cb2.setBounds(100,150,50,50);
                 cb3= new Checkbox ("PHP");
		 cb3.setBounds(100,200,80,50);
                 f.add(l);
		f.add(cb1);
               f.add(cb2);
               f.add(cb3);             
               f.setSize(500,500);                           
               f.setLayout(null);                           
               f.setVisible(true);
                
	}      

	public static void main(String[] args)
        {
            new CheckBoxDemo();
        }
                
                


}   
    
    
    

