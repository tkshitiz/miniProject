/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
class First extends Thread{
    public void run(){
        try{
        for(int i=0;i<5;i++){
            System.out.println("WOW");
            Thread.sleep(1000);
        }
        }catch(Exception e){
            System.out.println(e);
        } } }
class Second extends Thread{
    public void run(){
        try{
        for(int i=0;i<5;i++){
            System.out.println("AWESOME");
            Thread.sleep(1000);
        }
        }catch(Exception e){
            System.out.println(e);
        } } }


public class IsAliveAndJoin {
   public static void main(String[] args) {
        First t1 = new First();
        Second t2 = new Second();
        t1.start();
        System.out.println("Is t1 alive?? "+t1.isAlive());
        t2.start();
        System.out.println("Is t2 alive?? "+t2.isAlive());
        System.out.println("I am from main thread and I can appear anywhere");
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Is t1 alive?? "+t1.isAlive());
        System.out.println("Is t2 alive?? "+t2.isAlive());
        System.out.println("I am from main thread and I appear after t1 and t2 are dead");
        System.out.println("Bye Bye");
        System.out.println("babita,B,04");
 
}
}
