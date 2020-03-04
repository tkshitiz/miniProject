/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.TextFieldExamples;

/**
 *
 * @author dell
 */
import java.awt.event.*;
import javax.swing.*;
public class TextFieldExample implements ActionListener{
    JFrame f=new JFrame("example");
    JTextField t=new JTextField();
    JLabel l=new JLabel();
    void makeGUI()
    {
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);
        t.setBounds(50,100,200,20);
        t.addActionListener(this);
        l.setBounds(50,120,200,20);
        f.add(t);
        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String s=t.getText();
        l.setText(s);
    }
    public static void main(String[] args)
    {
        TextFieldExample tf=new TextFieldExample();
        tf.makeGUI();
    }
}
