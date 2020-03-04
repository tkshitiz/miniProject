/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;


interface  A1 { 
    void methl(); 
    void meth2(); 
}
interface B1 extends A1 { 
    void meth3(); 
} 
class MyClasss implements B1 { 
    public void methl() { 
        System.out.println("Implement methl()."); 
    } 
    public void meth2() { 
        System.out.println("Implement meth2().");
    }  
    public void meth3() { 
        System.out.println("Implement meth3()."); 
    } 
} 
class IFExtend { 
    public static void main(String arg[]) { 
        MyClasss ob = new MyClasss();
        ob.methl(); 
        ob.meth2();
        ob.meth3(); 
        System.out.println("babita,B,04");
    } 
}



