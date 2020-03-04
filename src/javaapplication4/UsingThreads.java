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
   public class UsingThreads extends Thread {
    public void run(){
    for(int i =101;i<=105;i++){
        System.out.println("Test Thread:printing-->"+i);
        }
    }
    public static void main(String[] args) {
        UsingThreads t1 = new UsingThreads();
        t1.start();
        for(int i =1 ;i<=5;i++){
            System.out.println("Main Thread: printing-->"+i);
        }
        System.out.println("babita,B,04");
    }
}

 

