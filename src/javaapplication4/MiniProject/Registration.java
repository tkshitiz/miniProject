/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.MiniProject;

/**
 *
 * @author dell
 */
// Java program to implement 
// a Simple Registration Form 
// using Java Swing 
import javax.swing.*;
import javax.swing.filechooser.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.io.*;



 import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JFileChooser;
import java.io.FileFilter;
import java.awt.image.BufferedImage;
import java.sql.*;
import java.awt.FileDialog;


class Registration extends JFrame implements ActionListener  {

    /**
     * ***************************COMPONENTS OF FORM*************
     *//////	
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JTextArea tout;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd, image;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JLabel res;
    private JTextArea resadd;
    private JLabel l1;//*******FOR IMAGE FILE***************
    private JButton b = new JButton("browse");
    File file = null;  //********FOR IMAGE FILE*************//
    String path;    //***********IMAGE PATH*****************//
    FileDialog fd;
    FileFilter filter;
    FileOutputStream fout;
     String data;
     String data1;
     JDialog jd;
      JButton jb;  
    JFileChooser chooser;
   UIManager um;
    
    JLabel vtname;  //**********validation reference for name field***********//   
    JLabel vmobile; //**********validation reference for  mobile**************// 
    JLabel vgender; //*********validation reference for  Gender***************//
    JLabel vdob;    //*********validation reference for  DOB******************//
    JLabel vaddress; //********validation reference for  address**************//
    JLabel vimg;     //********validation reference for  image**************// 
    //************************************************************************//
    private String dates[]
            = {" ","1", "2", "3", "4", "5",
                "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25",
                "26", "27", "28", "29", "30",
                "31"};
    private String months[]
            = {" ","Jan", "feb", "Mar", "Apr",
                "May", "Jun", "July", "Aug",
                "Sup", "Oct", "Nov", "Dec"};
    private String years[]
            = {"","1995", "1996", "1997", "1998",
                "1999", "2000", "2001", "2002",
                "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010",
                "2011", "2012", "2013", "2014",
                "2015", "2016", "2017", "2018",
                "2019"};

//*****************************END OF COMPONENTS OF FORM**************//////
//*****************************DATABASE CONNECTION**************//////
    public final String driver_name = "com.mysql.jdbc.Driver";
    public final String db_url = "jdbc:mysql://localhost:3306/kshitiz_java2";
    public final String db_username = "root";
    public final String db_password = "";
    Connection con;
//*****************************END OF DATABASE CONNECTION*************//////        

//****************************METHOD FOR INSERTING FORM DATA******************************************//////
    void ConnectMeAndFireQuery() {
        try {

            Class.forName(driver_name);
            con = DriverManager.getConnection(db_url, db_username, db_password);
            String name = tname.getText();
            String address = tadd.getText();
            String mobile = tmno.getText();
            String gender = "male";

            if (female.isSelected() == true) {

                gender = "female";

            }
            String dob = (String) date.getSelectedItem();
            String dob1 = (String) month.getSelectedItem();
            String dob2 = (String) year.getSelectedItem();
            String myquery = "insert into user_details(name,address,phone_number,gender,dob,image) values(?,?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(myquery);
            pstmt.setString(1, name);
            pstmt.setString(2, address);
            pstmt.setLong(3, Long.parseLong(mobile));
            pstmt.setString(4, gender);
            pstmt.setString(5, dob + "/"+ dob1 + "/" + dob2);
            pstmt.setString(6, path);
            int n;
            n = pstmt.executeUpdate();
            System.out.println("Thank you " + n + " record is added!");
            pstmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
//****************************END OF INSERTING FORM DATA******************************************//////      

//***************************RETRIEVING THE FORM DATA**********************************************////    
     void retrieveFromData(){
        String data1;
        String data
                = "Name : "
                + tname.getText() + "\n"
                + "Mobile : "
                + tmno.getText() + "\n"
                + "Path:" + path + "\n";
        if (male.isSelected()) {
            data1 = "Gender : Male"
                    + "\n";
        } else if (female.isSelected()) {
            data1 = "Gender : Female"
                    + "\n";
        } else {
            data1 = "Gender : " + null + "\n";
        }
        String data2
                
                = "DOB : "
                + (String) date.getSelectedItem()
                + "/" + (String) month.getSelectedItem()
                + "/" + (String) year.getSelectedItem()
                + "\n";
                
        String data3 = "Address : " + tadd.getText();
        tout.setText(data + data1 + data2 + data3);

    }
    //***************************END OF RETRIEVING THE FORM DATA**********************************************////    

     
 //*****************************************SAVING IN PDF FILE***********************************************************************
    
  void savingDataInPDF()
{
    
   try{
        
         String s= tout.getText();
    
         file=new File("D:/RegistrationFile.pdf");
         FileOutputStream fos=new FileOutputStream(file,true);   
         byte[] strToBytes =s.getBytes();
         fos.write(strToBytes);
         
//***************************LINE BREAK IN FILE--2 TIMES***********************************************************************************        
         String lineSeparator = System.getProperty("line.separator");
         String lineSeparator1 = System.getProperty("line.separator");
         fos.write(lineSeparator.getBytes());
         fos.write(lineSeparator1.getBytes());
//***************************END-LINE BREAK IN--2 TIMES***********************************************************************************               
         fos.flush();
         fos.close();
         System.out.println("writing data in D drive success.");
   
      }
   
    catch(IOException ioe)
      {
        System.out.println("Exception!!!");
        ioe.printStackTrace();
      }
}   

//****************************************END OF SAVING IN PDF FILE ************************************************************************
           
    
    
    
//******************************CONSTRUCTOR********************************************************//
    public Registration()  {
       
        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c = getContentPane();
        c.setLayout(null);
      
        //*************************************IMAGE FILE************************************************************
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFileChooser file = new JFileChooser();
                file.setCurrentDirectory(new File(System.getProperty("user.home")));
                //filter the files
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
                file.addChoosableFileFilter(filter);
                int result = file.showSaveDialog(null);
                //if the user click on save in Jfilechooser
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = file.getSelectedFile();
                    path = selectedFile.getAbsolutePath();
                    System.out.println(path);

                } else if (result == JFileChooser.CANCEL_OPTION) {
                    System.out.println("No File Select");
                }
            }

        });
//****************************************END OF IMAGE**************************************************//



        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
        b.setBounds(70, 100, 80, 20);
        c.add(b);
 
        
        
        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 18));
        name.setSize(100, 20);
        name.setLocation(200, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(300, 100);
        c.add(tname);

        mno = new JLabel("Mobile");
        mno.setFont(new Font("Arial", Font.PLAIN, 18));
        mno.setSize(100, 20);
        mno.setLocation(200, 150);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(190, 20);
        tmno.setLocation(300, 150);
        c.add(tmno);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 18));
        gender.setSize(100, 20);
        gender.setLocation(70, 220);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
//		male.setSelected(true); 
        male.setSize(75, 20);
        male.setLocation(200, 220);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(280, 220);
        c.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.PLAIN, 18));
        dob.setSize(100, 20);
        dob.setLocation(70, 270);
        c.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 270);
        c.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(270, 270);
        c.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(340, 270);
        c.add(year);

        add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 18));
        add.setSize(100, 20);
        add.setLocation(70, 320);
        c.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 320);
        tadd.setLineWrap(true);
        c.add(tadd);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(70, 450);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(80, 20);
        sub.setLocation(80, 500);
        sub.setActionCommand("sub");
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(200, 500);
        reset.addActionListener(this);
        c.add(reset);

        res = new JLabel("");
        res.setForeground(Color.red);
        res.setFont(new Font("Arial", Font.PLAIN, 15));
        res.setSize(300, 30);
        res.setLocation(70, 530);
        c.add(res);

        /////********************DISPLAY TEXTAREA***********************************
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
        //////********************END OF DISPLAY TEXTAREA*********************************////

//*********************************VALIDATION FOR IMAGE FILE***********************************************************//        
        vimg = new JLabel("");
        vimg.setForeground(Color.red);
        vimg.setFont(new Font("Arial", Font.PLAIN, 15));
        vimg.setSize(300, 20);
        vimg.setLocation(50, 150);
        c.add(vimg);
//********************************END OF VALIDATION FOR IMAGE FILE************************************************************//        

        //***************validation for Name field******//
        vtname = new JLabel("");
        vtname.setForeground(Color.red);
        vtname.setFont(new Font("Arial", Font.PLAIN, 15));
        vtname.setSize(300, 20);
        vtname.setLocation(300, 120);
        c.add(vtname);

        //************* End validation for Name field******//
        //  ***************validation for mobile no. field******//
        vmobile = new JLabel("");
        vmobile.setForeground(Color.red);
        vmobile.setFont(new Font("Arial", Font.PLAIN, 15));
        vmobile.setSize(300, 20);
        vmobile.setLocation(300, 170);
        c.add(vmobile);

        //************* End validation for mobile no. field******//
        //  ***************validation for Gender field******//
        vgender = new JLabel("");
        vgender.setForeground(Color.red);
        vgender.setFont(new Font("Arial", Font.PLAIN, 15));
        vgender.setSize(300, 20);
        vgender.setLocation(200, 240);
        c.add(vgender);
        //************* End validation for Gender field******//

        //  ***************validation for DOB field******//
        vdob = new JLabel("");
        vdob.setForeground(Color.red);
        vdob.setFont(new Font("Arial", Font.PLAIN, 15));
        vdob.setSize(300, 20);
        vdob.setLocation(200,270);
        c.add(vdob);
        //************* End validation for DOB field******//

        //  ***************validation for Address field******//
        vaddress = new JLabel("");
        vaddress.setForeground(Color.red);
        vaddress.setFont(new Font("Arial", Font.PLAIN, 15));
        vaddress.setSize(300, 20);
        vaddress.setLocation(200, 400);
        c.add(vaddress);

        //************* End validation for Address field******//
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);
       
          
        setVisible(true);

    }

    //******************************FOR EVENT HANDLING WHILE CLICKING SUBMIT BUTTON***********************//    
    public void actionPerformed(ActionEvent e){

        if (e.getActionCommand() == "sub") {

            if (term.isSelected()) 
            {
                
//**************************METHOD FOR RETRIEVING DATA************************************//
                this.retrieveFromData();               
//************************** END OF METHOD FOR RETRIEVING DATA************************************//

                //////**********VALIDATION FOR NAME FIELD***********//////
                if (tname.getText().equals("")) {
                    vtname.setText("Name field is required");
                } else {
                    tname.getText();
                    vtname.setText("");
                }
                //////**********END VALIDATION FOR NAME FIELD***********//////
                if (tmno.getText().equals("")) {
                    vmobile.setText("Mobile field is required");
                } else {

                    String mobile = tmno.getText();

                    if (mobile.length() > 10 || mobile.length() < 10) {
                        vmobile.setText("Number should be equals to 10");

                    } else {
                        tmno.getText();
                        vmobile.setText("");
                    }
                }

                ///***************** VALIDATION FOR GENDER FIELD**************///          
                if ((male.isSelected() == false) && (female.isSelected() == false)) {
                    vgender.setText("Gender field is required");
                } else {
                    gender.getText();
                    vgender.setText("");
                }
                ///***************** END OF VALIDATION FOR GENDER FIELD**************/// 

                ///***************** VALIDATION FOR DOB FIELD**************///          
                if ((date.getSelectedItem() == "") && (month.getSelectedItem() == "") && (year.getSelectedItem() == "")) {
                    vdob.setText("DOB field is required");
                } else {
                    date.getSelectedItem();
                    month.getSelectedItem();
                    year.getSelectedItem();
                    vdob.setText("");

                }
                ///***************** END OF VALIDATION FOR DOB FIELD**************///  

                ///***************** VALIDATION FOR ADDRESS FIELD**************///          
                if (tadd.getText().equals("")) {
                    vaddress.setText("Address field is required");
                } else {
                    tadd.getText();
                    vaddress.setText("");
                }
                ///***************** END OF VALIDATION FOR ADDRESS FIELD**************///  

                if (path == null) {
                    vimg.setText("Image field is required");
                } else {
                    vimg.setText("");
                }

                if (!vaddress.getText().equals("") || !vdob.getText().equals("") || !vgender.getText().equals("") || !vmobile.getText().equals("") || !vtname.getText().equals("") || !vimg.getText().equals("")) {
                    res.setText("Please fill up all the form data.");
                    res.setForeground(Color.red.darker());
                } else {
                    this.ConnectMeAndFireQuery();
                    this.savingDataInPDF();                  
                    um = new UIManager();//Object for dialog box class//
		    um.put("Panel.background", Color.lightGray);
                   JOptionPane.showMessageDialog(this,"Your Form Data is saved in D drive on your PC. Check it out!!", "Registration Successful!!!", JOptionPane.INFORMATION_MESSAGE);                                           
                }
                 
            } else {    

                resadd.setText("");
                res.setText("Please accept the"
                        + " terms & conditions..");

            }
        } else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
            vtname.setText(def);
            vmobile.setText(def);
            vgender.setText(def);
            vdob.setText(def);
            vaddress.setText(def);
            vimg.setText(def);
        }

    }

//****************************** END OF EVENT HANDLING WHILE CLICKING SUBMIT BUTTON***********************//    
   
    public static void main(String[] args) throws IOException {
        Registration r = new Registration();
        
    }
    
}
