/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.mouseHandlingUsingAdapterClass;

/**
 *
 * @author dell
 */
import javax.swing.*;
import java.awt.event.*;
public class PopupMenuDemo extends MouseAdapter{
    JFrame f= new JFrame("PopUpMenuDemo");
    JPopupMenu pm = new JPopupMenu("DoSomething");
    JMenuItem i1 = new JMenuItem("Profile");
    JMenuItem i2 = new JMenuItem("Copy");
    JMenuItem i3 = new JMenuItem("Cut");
    JMenuItem i4 = new JMenuItem("Paste");
    JMenuItem i5 = new JMenuItem("Refactor");
    PopupMenuDemo(){
        pm.add(i1); pm.add(i2); pm.add(i3); pm.add(i4); pm.add(i5);
        f.setSize(400,400);
        f.addMouseListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
        f.add(pm);
    }
    public void mouseClicked(MouseEvent e){
        if(e.getButton()== MouseEvent.BUTTON3){
            pm.show(f, e.getX(),e.getY());
        }
    }
    public static void main(String[] args){
        new PopupMenuDemo();
    }
}
