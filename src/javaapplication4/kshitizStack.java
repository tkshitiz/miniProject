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
public class kshitizStack {
   int size;
	int arr[];
	int top;
 
	 kshitizStack(int kshitiz) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
 
	public void push_kshitiz(int pushedElement_by_kshitiz) {
		if (!isFull_kshitiz()) {
			top++;
			arr[top] = pushedElement_by_kshitiz;
			System.out.println("Pushed element:" + pushedElement_by_kshitiz);
		} else {
			System.out.println("Stack is full !");
		}
	}
 
	public int pop_kshitiz() {
		if (!isEmpty_kshitiz()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + arr[returnedTop]);
			return arr[returnedTop];
 
		} else {
			System.out.println("Stack is empty !");
			return -1;
		}
	}
 
	public int peek_kshitiz() {
		if(!this.isEmpty_kshitiz())
                        return arr[top];
                else
                {
                        System.out.println("Stack is Empty");
                        return -1;
                }
	}
 
	public boolean isEmpty_kshitiz() {
		return (top == -1);
	}
 
	public boolean isFull_kshitiz() {
		return (size - 1 == top);
	}
 
	public static void main(String[] args) {
		  kshitizStack kshitiz = new  kshitizStack(10);
		kshitiz.pop_kshitiz();
		System.out.println("=================");
		 kshitiz.push_kshitiz(10);
		 kshitiz.push_kshitiz(30);
		 kshitiz.push_kshitiz(50);
		 kshitiz.push_kshitiz(40);
		System.out.println("=================");
		 kshitiz.pop_kshitiz();
		 kshitiz.pop_kshitiz();
		 kshitiz.pop_kshitiz();
		System.out.println("=================");
                System.out.println("kshtiz thapa");
	}
        
}
