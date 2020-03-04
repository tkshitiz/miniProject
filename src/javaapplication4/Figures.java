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
 class Figure {
   double dim1,dim2;
    Figure(double a, double b){
        dim1=a;
        dim2=b;
    }
    double area(){
        System.out.println("Area for figure is undefined");
        return 0;
    }
}
class Rect extends Figure{
    Rect(double a, double b) {
        super(a, b);
    }
    //overriding area for Rectangle
    double area(){
        System.out.println("Inside area for Rectangle");
        return dim1*dim2;
    }
}
class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }
    //overriding area for right angled Triangle
    double area(){
        System.out.println("Inside area for right angled Triangle");
        return (dim1*dim2)/2;
    }
}
public class Figures {
    public static void main(String[] args) {
        Figure f = new Figure(10,10);
        Rect r= new Rect(9,5);
        Triangle t = new Triangle(10,8);
        Figure figref;
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = f;
        System.out.println("Area is " + figref.area());
        System.out.println("babita,B,04");
    }
 
}
