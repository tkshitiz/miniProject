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
public class ThreadPriorityDemo extends Thread{
        ThreadPriorityDemo(String n){
        super(n);
    }
    public void run(){
        System.out.println("running thread name is:"+Thread.currentThread().getName()+"\t thread priority is:"+Thread.currentThread().getPriority());
    }
    public static void main(String args[]){
        ThreadPriorityDemo tpd1=new ThreadPriorityDemo("T1");
        ThreadPriorityDemo tpd2=new ThreadPriorityDemo("T2");
        ThreadPriorityDemo tpd3=new ThreadPriorityDemo("T3");
        ThreadPriorityDemo tpd4=new ThreadPriorityDemo("T4");
        tpd1.setPriority(Thread.MIN_PRIORITY);
        tpd2.setPriority(Thread.NORM_PRIORITY);
        tpd3.setPriority(4);
        tpd4.setPriority(Thread.MAX_PRIORITY);
        tpd1.start();
        tpd2.start();
        tpd3.start();
        tpd4.start();
        System.out.println("babita,B,04");
    } }


