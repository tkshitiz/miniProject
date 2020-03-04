/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public class Queue_Kshitiz {
    private static int front, rear, capacity; 
    private static int queue[]; 
    Queue_Kshitiz(int Kshitiz) 
    { 
        front = rear = 0; 
        capacity = Kshitiz; 
        queue = new int[capacity]; 
    }  
    static void queueEnqueue(int data_Kshitiz) 
    { 
        if (capacity == rear) { 
            System.out.printf("Queue is full\n"); 
        } 
        else { 
            queue[rear] = data_Kshitiz; 
            rear++; 
        }
    } 
    static void queueDequeue() 
    { 
        if (front == rear) { 
            System.out.printf("Queue is empty\n"); 
        } 
        else { 
            for (int i = 0; i < rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
            if (rear < capacity) 
                queue[rear] = 0; 
            rear--; 
        } 
    } 
    static void queueDisplay() 
    { 
        int i_Kshitiz; 
        if (front == rear) { 
            System.out.printf("Queue is Empty\n"); 
            return; 
        } 
        for (i_Kshitiz = front; i_Kshitiz < rear; i_Kshitiz++) { 
            System.out.printf(" %d\t ", queue[i_Kshitiz]); 
        } 
    } 
    static void queueFront() 
    { 
        if (front == rear) { 
            System.out.printf("Queue is Empty\n"); 
        } 
        System.out.printf("\nFront Element is: %d", queue[front]); 
    } 
} 
    class kshitizQueue {
    public static void main(String[] args) 
    {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Queues");
        int Kshitiz=sc.nextInt();
        kshitizQueue  Kshitiz1= new kshitizQueue();
         Kshitiz1.queueDisplay();
        System.out.println("\nEnter Elements in Queues:");
        for(int i=0;i<Kshitiz;i++){
            int K=sc.nextInt();
            Kshitiz1.queueEnqueue(Kshitiz);
        } 
        Kshitiz1.queueDisplay();
        for(int i=0;i_Thapa<Kshitiz;i_thapa++){
            Kshitiz1.queueDequeue();
            System.out.printf("\nAfter node deletion:\n");
            Kshitiz1.queueDisplay(); 
        }
        System.out.println("Kshitiz");
    } 

}
