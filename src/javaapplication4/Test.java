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
   
interface Test {
      void draw();
}
class Rectangles implements Test{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circles implements Test{
    public void draw(){
        System.out.println("drawing circle");
    }
}
 public class Test{
    public static void main(String args[]){
        Test d=new Circle();
        d.draw();
        System.out.println("Milan,B,11");
    }
}
 
}
