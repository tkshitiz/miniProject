/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

enum apple
        
{
    jonathan,GoldenDel,RedDel,Winesap,CortLand
}
public class EnumDemo {
    public static void main(String[] args){
       apple ap;
       ap=apple.RedDel;
       System.out.println("value of ap:"+ap);
       System.out.println();
       ap=apple.GoldenDel;
       if(ap==apple.GoldenDel)
           System.out.println("ap contains GoldenDel./n");
       switch(ap){
           case jonathan:
            System.out.println("jonathan is red");
            break;
           case GoldenDel:
               System.out.println("golden delicoius is yellow");
               break;
           case RedDel:
               System.out.println("red delicious is red");
               break;
           case Winesap:
               System.out.println("wineap is red");
               break;
           case CortLand:
               System.out.println("cortland is red");
              
                       }
        System.out.println("manish, B,10");
    }
}
