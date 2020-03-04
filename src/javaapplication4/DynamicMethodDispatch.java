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

    class aA{
    void callme(){
        System.out.println("Im from A's callme method"); }
}
class bB extends aA{
    void callme(){
        System.out.println("Im from B's callme method");}
}
class cC extends aA{
    void callme(){
        System.out.println("Im from C's callme method");}
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        aA a = new aA();//object of type A
        bB b = new bB();//object of type B
        cC c = new cC();//object of type C
        aA r ;// obtain a reference of type A
        r=a;//now r refers to an object of A
        r.callme();//calls A's version of callme()
        r=b;//now r c
        r.callme();//calls B's version of callme()
        r=c;//now refers to an object of C
        r.callme();//calls C's version of callme()
        System.out.println("babita,B,04");
    }
}


