/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.ButtonsWithIcon;

/**
 *
 * @author dell
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonsWithIcon implements ActionListener{
    JFrame f=new JFrame();
    JLabel l1=new JLabel();
    JLabel l2=new JLabel();
    JButton b1,b2;
    ImageIcon icon1= new ImageIcon("C:\\Users\\dell\\Pictures\\Saved Pictures\\image.jpg");   
    ImageIcon icon2=new ImageIcon("C:\\Users\\dell\\Pictures\\Saved Pictures\\images.jpg");
    
    void makeWindow()
    {
        b1=new JButton(icon1);
        b1.addActionListener(this);
        b1.setActionCommand("image 1");
        b2=new JButton(icon2);
        b2.setActionCommand("image 2");
        b2.addActionListener(this);
        f.setSize(500,500);
        f.setVisible(true);
   f.setLayout(new GridLayout(2,2,30,30));
        f.add(b1);f.add(l1);
        f.add(b2);f.add(l2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand()=="image 1")
            l1.setText("image 1 is clicked");
        
        if(e.getActionCommand()=="image 2")
            l2.setText("image 2 is clicked");
    }
    
    public static void main(String[] args)
    {
        ButtonsWithIcon bwi=new ButtonsWithIcon();
        bwi.makeWindow();
    }
    
    
    
    
}
