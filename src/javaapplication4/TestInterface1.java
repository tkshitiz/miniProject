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
   interface Drawable {
      void draw();
}
//Implementation: by second user
class Rectangless implements Drawable{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circless implements Drawable{
    public void draw(){
        System.out.println("drawing circle");
    }
}
class TestInterface1{
    public static void main(String args[]){
        Drawable d=new Circless();
        d.draw();
        System.out.println("babita,B,04");
    }
}
 
