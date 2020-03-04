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
 class Table {
void printTable(int n){
    synchronized(this){
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
 }
class mythread11 extends Thread{
     
    MulTable t;
    mythread11(MulTable t){
      this.t=t;  
    }
    public void run(){
        t.printTable(5);
        
    }
}
class mythread22 extends Thread{
     
    MulTable t;
    mythread22(MulTable t){
      this.t=t;  
    }
    public void run(){
        t.printTable(100);
        
    }
}
  public class Synchronized{
public static void main(String[] args){
MulTable obj=new MulTable();
mythread11 t1=new mythread11(obj);
mythread22 t2=new mythread22(obj);
t1.start();
t2.start();
    System.out.println("babita,B,04");

}
  }

