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
   interface Printable{
    void print();
}
interface Showable{
    void show();
}
class Tests implements Printable,Showable{
    public void print(){
        System.out.println("welcome");
    }
    public void show()
    {
        System.out.println("dude");
    }
    public static void main(String args[]){
        Tests obj = new Tests();
        obj.print();
        obj.show();
        System.out.println("babita,B,04");
    }
}
 

