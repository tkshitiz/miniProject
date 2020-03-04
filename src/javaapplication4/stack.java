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

    public  class stack{
    int stck[]=new int[10];
    int tos;
    stack(){
        tos=-1;
    }	
    void push(int item){
        if(tos==9){
            System.out.println("Stack is full");
        }
        else{
            stck [++tos]=item;
        }
    }
    int pop(){
        if(tos<0){
           System.out.println("Stack is underflow");
           return 0;
        }
        else{
            return stck[tos--];
        }
    }
}
class testStack{
    public static void main(String[] args){
        stack myStack1=new stack();
        stack myStack2=new stack();
        for(int i=0;i<10;i++){
            myStack1.push(i);
        }
        for(int i=10;i<20;i++){
            myStack2.push(i);
        }
        System.out.println("The value in myStack1: ");
        for(int i=0;i<10;i++){
            System.out.println(myStack1.pop());
        }
        System.out.println("The value in myStack2: ");
        for(int i=0;i<10;i++){
            System.out.println(myStack2.pop());
        }
        System.out.println("kshitiz,B,09");
    }	}

