/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.ToggleButton;

/**
 *
 * @author dell
 */
import java.awt.event.*;
import javax.swing.*;
public class ToggleExample implements ItemListener{
    JToggleButton jbt;
    JFrame f;
    void prepareWindow(){
        f = new JFrame("Toggle Button Demo");
        jbt = new JToggleButton("ON");
        jbt.setBounds(50,50,100,80);
        jbt.addItemListener(this);
        f.add(jbt);
        f.setLayout(null);
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void itemStateChanged(ItemEvent e){
        if (jbt.isSelected())
            jbt.setText("OFF");
        else
            jbt.setText("ON");
    }
    public static void main(String[] args) {
        ToggleExample te = new ToggleExample();
        te.prepareWindow();
    }
}

