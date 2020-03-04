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

   class Box{
    double width;
    double height;
    double depth;
    void volume()
    {
        System.out.println("the volume of box"+width*height*depth);
        
    }
}
          
        public class BoxTest {
            public static void main(String[] args){
                Box mybox1=new Box();
                 Box mybox2=new Box();
                 mybox1.width=10;
                  mybox1.height=20;
                   mybox1.depth=30;
                    mybox2.width=5;
                     mybox2.height=8;
                      mybox2.depth=9;
                      mybox1.volume();
                       mybox2.volume(); 
                       System.out.println("Manish,10,B"); 
}
            }  
           


 

