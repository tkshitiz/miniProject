/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.RadioButton;

/**
 *
 * @author dell
 */
import javax.swing.*;
import java.awt.event.*;
class RadioButtonExample extends JFrame implements ActionListener{
    JRadioButton rb1,rb2, rb3;
    JLabel l1,l2;
    void manageWindow(){
        l1 = new JLabel("Please select the Course:");
        l1.setBounds(50,40,200,30);
        rb1=new JRadioButton("BIM",true);
        rb1.setBounds(100,100,100,30);
        rb1.setActionCommand("bim");
        rb1.addActionListener(this);
        rb2=new JRadioButton("Bsc.CSIT");
        rb2.setBounds(200,100,100,30);
        rb2.setActionCommand("csit");
        rb2.addActionListener(this);
        rb3=new JRadioButton("BCA");
        rb3.setBounds(300,100,100,30);
        rb3.setActionCommand("bca");
        rb3.addActionListener(this);
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);bg.add(rb2);bg.add(rb3);
        l2 = new JLabel();
        l2.setBounds(50,200,300,30);
        add(l1);add(rb1);add(rb2);add(rb3);add(l2);
        setTitle("Courses Available");
        setSize(500,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        l2.setText("You have selected "+s+ " Program");
    }
    public static void main(String args[]){
        RadioButtonExample rbe =new RadioButtonExample();
        rbe.manageWindow();
    }
}

