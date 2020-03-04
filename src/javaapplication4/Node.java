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
public class Node {
    protected int data;
    protected Node next;
    public Node(){
        next = null;
        data = 0;
    }
    public Node(int d){
        data = d;
        next = null;
    }
}
class linkedStack{
    protected Node top ;
    protected int size ;
    public linkedStack(){
        top = null;
        size = 0;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public int getSize(){
        return size;
    }
    public void push(int data){
        Node ptr = new Node (data);
        if (top == null)
        top = ptr;
        else{
            ptr.next = top;
            top = ptr;
        }
        size++ ;
    }
    public int pop(){
        if (isEmpty() )
        return 0;
        Node ptr = top;
        top = ptr.next;
        size-- ;
        return ptr.data;
    }
    public void display(){
        if (size == 0){
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = top;
        while (ptr != null)
        {
            System.out.print(ptr.data+" ");
            ptr = ptr.next;
        }
        System.out.println();
    }
}
 class LinkedStackImplement{
    public static void main(String[] args){
    linkedStack ls = new linkedStack();
    ls.push(10);
    ls.push(20);
    ls.push(30);
    ls.push(40);
    ls.push(50);
    ls.push(60);
    System.out.println("Stack before popping");
    ls.display();
    System.out.println("The size of linked list is "+ls.getSize());
    System.out.println("Stack after popping");
    ls.pop();
    ls.display();
    System.out.println("The size of linked list is "+ls.getSize());
        System.out.println("kshitiz,08,B");
    }

}
