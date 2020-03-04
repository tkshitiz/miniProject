/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.mouseHandling;

/**
 *
 * @author dell
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseEventHandling implements MouseListener{
    JFrame f=new JFrame("Mouse Handling");
    void getReady(){
        f.setSize(360, 360);
        f.setLayout(null);
        f.addMouseListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e){
        Graphics g=f.getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(),e.getY(),10,20);
    }
    @Override
    public void mouseEntered(MouseEvent e){
    }
    @Override
    public void mouseExited(MouseEvent e){
    }
    @Override
    public void mousePressed(MouseEvent e){
    }
    @Override
    public void mouseReleased(MouseEvent e){
    }
    
    public static void main(String[] args){
        MouseEventHandling m=new MouseEventHandling();
        m.getReady();
    }
}


