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
abstract class Shapes{ 
    void meth(){ 
System.out.println("I am from normal method"); 
}  
    abstract void draw();   
}   
class Rectangle extends Shapes{ 
    void draw(){ 
System.out.println("drawing rectangle");
    }   
}  
class Circle extends Shapes{  
    void draw(){ 
System.out.println("drawing circle"); 
}  
}
class TestAbstraction{  
    public static void main(String args[]){
        Shapes s=new Circle(); 
s.draw();  
System.out.println("kshitiz,B,09");
}   
}   
