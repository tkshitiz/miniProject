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
public class QNode {

    public int info;
    public QNode next;

    public QNode() {
        info = 0;
        next = null;
    }

    public QNode(int el) {
        info = el;
        next = null;
    }
}

class Queue {

    private QNode front;
    private QNode rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int el) {
        QNode temp = new QNode(el);
        if (rear == null) {
            rear = temp;
            front = rear;
        } else {
            rear.next = temp;
            rear = temp;
        }
    }

    public void dequeue() {
        QNode temp;
        if (front == null) {
            System.out.println("Queue is empty");
            front = rear = null;
        } else {
            front = front.next;
        }
    }

    public void display() {
        QNode temp;
        for (temp = front; temp != rear; temp = temp.next) {
            System.out.print(temp.info + "-");
        }
        System.out.print(temp.info);
    }
}

class LinkedListQueue {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        System.out.println("Queue before deletion");
        q.display();
        System.out.println("\nQueue after deletion");
        q.dequeue();
        q.display();
        System.out.println("kshitiz,08,B");
    }

}
