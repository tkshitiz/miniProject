/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;


import java.applet.Applet;
import java.awt.*;
	
public class AppletFrames extends Applet{
Frame f;
	public void init()
	{
		f=new Frame("a frame window");
		Label l=new Label("kshitiz");
		f.add(l);
		f.setSize(200,200);
		f.setVisible(true);
	}

	public void start()
	{
		f.setVisible(true);
	}

	public void stop()
	{
		f.setVisible(true);
	}

	public void paint(Graphics g)
	{
		g.drawString("this is an applet window",25,50);
	}


}   
    
    
    
}
