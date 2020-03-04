/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.ImageIcon;

/**
 *
 * @author dell
 */
import javax.swing.*;
public class TestingImageIcon {
    JFrame f;JLabel l;ImageIcon ic;
    private void makeWindow()
    {
        ic=new ImageIcon("C:\\Users\\dell\\Pictures\\Saved Pictures\\images.jpg");
        f=new JFrame("image icon demo");
        l=new JLabel(ic,JLabel.CENTER);
        f.add(l);
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        TestingImageIcon ti=new TestingImageIcon();
        ti.makeWindow();
    }
}
