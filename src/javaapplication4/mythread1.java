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

class MulTable{
void printTable(int n){
System.out.println("table="+n);
for(int i=1;i<=10;i++){
System.out.println(n*i);
try{
Thread.sleep(400);
}
catch(InterruptedException e){
    System.out.println(e);
}
}
}
}
class mythread extends Thread{
     
    MulTable t;
    mythread(MulTable t){
      this.t=t;  
    }
    public void run(){
        t.printTable(5);
        
    }
}
class mythread2 extends Thread{
     
    MulTable t;
    mythread2(MulTable t){
      this.t=t;  
    }
    public void run(){
        t.printTable(100);
        
    }
}
  public class mythread1{
public static void main(String[] args){
MulTable obj=new MulTable();
mythread t1=new mythread(obj);
mythread2 t2=new mythread2(obj);
t1.start();
t2.start();
}
  }