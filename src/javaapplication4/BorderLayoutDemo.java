/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;



import java.awt.*;
	
public class BorderLayoutDemo {

	
            Frame f=new Frame("GridDemo");
		Button l1= new Button ("North");
                Button  l2= new Button ("South");
                Button  l3= new Button ("East");
                Button  l4= new Button ("West");
                
		
		
		
               BorderLayoutDemo()
	{ 
               
               f.setSize(500,500);              
              
               f.setLayout(new BorderLayout());
               f.add(l1,BorderLayout.NORTH);
               f.add(l2,BorderLayout.SOUTH);
               f.add(l3,BorderLayout.EAST);
               f.add(l4,BorderLayout.WEST);
               f.setVisible(true);
                
	}      

	public static void main(String[] args)
        {
            new BorderLayoutDemo();
        }
                
                


}   
    
    
    

