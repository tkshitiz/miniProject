/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;



import java.awt.*;
	
public class GridLayoutDemo {

	
            Frame f=new Frame("GridDemo");
		Button l1= new Button ("1");
                Button  l2= new Button ("2");
                Button  l3= new Button ("3");
                Button  l4= new Button ("4");
                
		
		
		
               GridLayoutDemo()
	{ 
               
                f.setSize(500,500);              
               f.add(l1);
               f.add(l2);
               f.add(l3);
               f.add(l4);
               f.setLayout(new GridLayout(1,4));
               f.setVisible(true);
                
	}      

	public static void main(String[] args)
        {
            new GridLayoutDemo();
        }
                
                


}   
    
    
    

