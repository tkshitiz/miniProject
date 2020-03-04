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

  abstract class sShape{
    void meth(){
        System.out.println("I am from normal method");
    }
    abstract void draw();
}
class rRectangle extends sShape{
    void draw(){
        System.out.println("drawing rectangle");
    }
}
class cCircle extends sShape{
    void draw(){
        System.out.println("drawing circle");
    }
}
class TestAbstractions{
    public static void main(String args[]){
        sShape s=new cCircle();
        s.draw();
        System.out.println("manish,B,10");
    }
}
  

