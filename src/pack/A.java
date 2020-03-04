/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author dell
 */

   
public class A {
    public void msg() {
        System.out.println("Hello");
    }
}


package MyPack;
class B {
    public static void main(String args[]) {
        Pack.A obj = new Pack.A(); //using fully qualified name
        obj.msg();
        System.out.println("kshitiz,B,10");
    }	}

}
