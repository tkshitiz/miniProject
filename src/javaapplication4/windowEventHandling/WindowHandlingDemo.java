/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.windowEventHandling;

/**
 *
 * @author dell
 */

import java.awt.event.*;
import javax.swing.*;
 
class MyFrame extends JFrame {
    WindowHandlingDemo wh=new WindowHandlingDemo();
    MyFrame(){
        JButton b=new JButton("Click");
        b.setBounds(50,100,80,40);
        add(b);
        addWindowListener(wh);
        setSize(400,400);
        setLayout(null);
        setTitle("First Frame");
        setVisible(true);
    }
    
 public class WindowHandlingDemo implements WindowListener{
    @Override
    public void windowOpened(WindowEvent e){
        System.out.println("Window is Opened");
    }
    @Override
    public void windowClosed(WindowEvent e){
        System.out.println("Window is Closed");
    }
    @Override
    public void windowActivated(WindowEvent e){
        System.out.println("Window is Activated");
    }
    @Override
    public void windowClosing(WindowEvent e){
        System.out.println("Window is Closing");
    }
    @Override
    public void windowDeactivated(WindowEvent e){
        System.out.println("Window is Deactivated");
    }
    @Override
    public void windowIconified(WindowEvent e){
        System.out.println("Window is Iconified");
    }
    @Override
    public void windowDeiconified(WindowEvent e){
        System.out.println("Window is Deiconified");
    }
}

    public static void main(String args[]){
        MyFrame f1=new MyFrame();
    }
}

