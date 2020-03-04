/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.UsingPreparedStatement;

/**
 *
 * @author dell
 */
import java.sql.*;
public class ReadFromUser {
    public static void main(String[] args)
    {
        String classname="com.mysql.jdbc.Driver";
        String db_url="jdbc:mysql://localhost:3306/kshitiz_java2";
        String db_username="root";
        String password="";
        try{
            Class.forName(classname);
            Connection con;
            con=DriverManager.getConnection(db_url,db_username,password);
            Statement stmt;
            stmt=con.createStatement();
            String myquery="select * from students";
            ResultSet rs;
            rs=stmt.executeQuery(myquery);
            int rn;
            long phn;
            String fn,ln,adr;
            while(rs.next()){
                rn=rs.getInt(1);
                fn=rs.getString(2);
                ln=rs.getString(3);
                phn=rs.getLong(5);
                adr=rs.getString(4); 
                System.out.println("Roll no:"+rn+"\t"
                +"First name:"+fn+"\t"+"Last name:"+ln+"\t"+"phone number:"+phn+"\t"+"Address:"+adr+"\t");                              
            }
            stmt.close();
            con.close();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
