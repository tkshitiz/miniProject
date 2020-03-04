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

    class ThreadDemo extends Thread {
    private String threadName;
    ThreadDemo(String name) {
        threadName = name;
        System.out.println("Creating: " + threadName );
    }
    public void run() {
        System.out.println("Running :" + threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", printing : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread :" + threadName + " interrupted.");
        }
         System.out.println("Thread :" + threadName + " exiting.");
    } }
public class thread {
    public static void main(String args[]) {
        Thread t1 = new Thread("Thread111");
        t1.start();
        Thread t2 = new ThreadDemo("Thread222");
        t2.start();
        System.out.println("babita,B,04");
        
    } 
}


