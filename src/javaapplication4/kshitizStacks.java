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
public class kshitizStacks {
    int size;
	int arr[];
	int top;
 
	 kshitizStacks(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
 
	public void push_kshitiz(int pushedElement) {
		if (!isFullKshitiz()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed element:" + pushedElement);
		} else {
			System.out.println("Stack is full !");
		}
	}
 
	public int pop_kshitiz() {
		if (!isEmptykshitiz()) {
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
		if(!this.isEmptykshitiz())
                        return arr[top];
                else
                {
                        System.out.println("Stack is Empty");
                        return -1;
                }
	}
 
	public boolean isEmptykshitiz() {
		return (top == -1);
	}
 
	public boolean isFullKshitiz() {
		return (size - 1 == top);
	}
 
	public static void main(String[] args) {
		 kshitizStacks kshitiz= new kshitizStacks(10);
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
                System.out.println("kshitiz thapa,B,08");
                    
	}
}
