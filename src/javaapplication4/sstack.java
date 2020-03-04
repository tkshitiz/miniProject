/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
    import java.util.Scanner;


public class sstack {
    static final int var = 500;
    int stck[]=new int[var];
    int top;
    sstack(){
        top=-1;
    }
    void push(int value){
        if(top==(var-1)){
            System.out.println("Stack is full");
        }
        else{
            top++;
            stck [top]=value;
            System.out.println(value + " pushed into stack");
        }
    }
    int pop(){
        if(top<0){
           System.out.println("Stack is underflow");
           return 0;
        }
        else{
            int value=stck[top];
            top--;
            return value;
        }
    }
}
class tack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        sstack myStack=new sstack();
        System.out.println("Enter size of stack:");
        int n=sc.nextInt();
        System.out.println("Enter value in stack:");
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            myStack.push(a);
        }
        System.out.println("\nThe value in myStack1: ");
        for(int i=0;i<n;i++){
            System.out.println(myStack.pop() + " Popped from stack");
        }
    }
}



