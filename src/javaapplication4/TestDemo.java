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

    class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;
    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating: " + threadName );
    }
public void run() {
    System.out.println("Running :" + threadName );
    try {
        for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + "printing : " + i);
            Thread.sleep(50);
        }
    } catch (InterruptedException e) {
            System.out.println("Thread :" + threadName + "interrupted.");
        }
        System.out.println("Thread :" + threadName + "exiting.");
    } }
  public class TestDemo {
    public static void main(String args[]) {
        RunnableDemo r1 = new RunnableDemo( "ThreadOne");
        Thread t1 = new Thread(r1);
        t1.start();
        RunnableDemo r2 = new RunnableDemo( "ThreadTwo");
        Thread t2 = new Thread(r2);
        t2.start();
  System.out.println("manish,10,B");
}
  }
