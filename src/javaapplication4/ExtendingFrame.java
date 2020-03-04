/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;



import java.awt.*;
	
public class ExtendingFrame extends Frame{

	ExtendingFrame()
	{
		Button b= new Button("click");
		b.setBounds(50,100,60,30);
		add(b);
		setSize(200,200);
                
                setLayout(null);
                setVisible(true);
                setTitle("first frame");
                
	}      

	public static void main(String[] args)
        {
            new ExtendingFrame();
        }
                
                


}   
    
    
    

