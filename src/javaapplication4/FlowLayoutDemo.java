/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;



import java.awt.*;
	
public class FlowLayoutDemo {

	
            Frame f=new Frame("FlowDemo");
		Label l1= new Label("Sunday");
                Label l2= new Label("Monday");
                Label l3= new Label("Tuesday");
                Label l4= new Label("Wednesday");
                FlowLayoutDemo()
	{
		
		
		
                
                f.setLayout(new FlowLayout(FlowLayout.LEFT,20,80));
                f.setSize(500,500);
                f.setVisible(true);
               f.add(l1);
               f.add(l2);
               f.add(l3);
               f.add(l4);
                
	}      

	public static void main(String[] args)
        {
            new FlowLayoutDemo();
        }
                
                


}   
    
    
    

