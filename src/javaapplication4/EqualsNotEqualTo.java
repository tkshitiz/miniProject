/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

public class EqualsNotEqualTo{ 
    public static void main(String[] args){
        String s1="CDCSIT,TU";
        String s2=new String(s1);
        System.out.println(s1+"=="+s2+"-->"+(s1==s2));
        System.out.println(s1+" equals "+s2+"-->"+s1.equals(s2));
    }
}
