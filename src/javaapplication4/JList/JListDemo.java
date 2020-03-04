/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.JList;

/**
 *
 * @author dell
 */
import javax.swing.*;
import javax.swing.event.*;
public class JListDemo implements ListSelectionListener{
    JFrame f = new JFrame("JList Demo");
    JList<String> jlst;
    JLabel l;
    JScrollPane p;
    String Cities[]={"Kathmandu","Pokhara","Hetauda","Birgunj",
    "Dharan","Ramechhap"};
    void makeGUI(){
        jlst = new JList<String>(Cities);
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        p = new JScrollPane(jlst);
        p.setSize(150, 200);
        l = new JLabel("Choose a city");
        jlst.addListSelectionListener(this);
        f.add(p);f.add(l);
        f.setSize(400, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void valueChanged(ListSelectionEvent lse){
        int idx = jlst.getSelectedIndex();
        if(idx!=-1)
            l.setText("Current City : "+Cities[idx]);
        else
            l.setText("Choose a city");
    }
    public static void main(String[] args) {
        JListDemo jd = new JListDemo();
        jd.makeGUI();
    }
}

