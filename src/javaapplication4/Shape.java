//method overloading lab:28
package javaapplication4;

/**
 *
 * @author dell
 */
public class Shape {
 

double computeArea(double r){
    return 3.14*r*r;
}
 double computeArea(double l,double b){
     return l*b;
}
public static void main(String[] args){
    Shape ob=new Shape();
    System.out.println("the area of rectangle is:");
     System.out.println(ob.computeArea(5.4,3.4));
      System.out.println("the area of circle is:");
       System.out.println(ob.computeArea(4.5));
       System.out.println("babita,04,B");
}
}
