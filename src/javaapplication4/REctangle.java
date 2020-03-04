/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author dell
 */
public class REctangle {
        double length;
    double breadth;
    REctangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public String toString(){
        return("Dimension of rectangle is: "+length+" by "+breadth);
    }
    public static void main(String[] args){
        Rectangle r=new Rectangle(4.7,3.5);
        System.out.println(r);
        System.out.println("Manish,B,10");
    }

}
