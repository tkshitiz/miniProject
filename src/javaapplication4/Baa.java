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
public class Baa {
      public void msg() {
        System.out.println("Hello");
    }
}


package javaapplication4;
class B {
    public static void main(String args[]) {
        Pack.A obj = new Pack.A(); //using fully qualified name
        obj.msg();
        System.out.println("Milan,B,11");
    }	}
  
}
