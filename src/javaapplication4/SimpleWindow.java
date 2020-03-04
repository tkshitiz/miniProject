package javaapplication4;
import java.awt.Color;
import javax.swing.*;
public class SimpleWindow {
    JFrame f = new JFrame("Swing GUI");
    JTextField t= new JTextField();
    JPasswordField p = new JPasswordField();
    JLabel l1 = new JLabel("Enter UserName");
    JLabel l2 = new JLabel("Enter Password");
    JButton b = new JButton("Send");
    JTextArea ta = new JTextArea();
    SimpleWindow(){
        f.setSize(500,500);
        l1.setBounds(10,10,200,20);
        t.setBounds(10,30,200,20);
        l2.setBounds(10,50,200,20);
        p.setBounds(10,70,200,20);
        p.setToolTipText("Enter The Password Here");
        p.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        b.setBounds(10,320,40,40);
        ta.setBounds(10, 100, 300, 200);
        ta.setBorder(BorderFactory.createTitledBorder("FeedbackHere"));
        b.setBorder(BorderFactory.createRaisedBevelBorder());
        f.add(l1); f.add(l2); f.add(t);f.add(p); f.add(ta);f.add(b);
        f.setLayout(null);
        f.setResizable(true);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new SimpleWindow();
    }
}
