/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;


import java.applet.Applet;
import java.awt.*;
	
public class InstantiatingFrame{
Frame f;
	InstantiatingFrame()
	{
		f=new Frame("a frame window");
		Label l=new Label("welcome to java GUI");
		f.add(l);
		f.setSize(200,200);
		f.setVisible(true);
	}
        
        public void stop()
        {
            f.setVisible(true);
        }

	public static void main(String[] args)
        {
            new InstantiatingFrame();
        }
                
                


}   
    
    
    

