/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public class cirKshitiz {
    public static void main(String args[]){
        Queue_KSHITIZ kshitiz = new Queue_KSHITIZ();
        int ch;
        Scanner sc_kshitiz =new Scanner(System.in);
        do{
            System.out.println("Menu\n1.insert\t2.delete\t3.display\t4.destroy\t5.exit");
            System.out.print("Enter choice :");
            ch=sc_kshitiz.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter data to insert:");
                    int x=sc_kshitiz.nextInt();
                    kshitiz.insert(x);
                break;
                case 2:
                    if(kshitiz.empty())
                    System.out.println("Queue underflow");
                    else{
                        int z =kshitiz.delete();
                        System.out.println("data deleted =" + z );
                    }
                break;
                case 3: kshitiz.display();
                break;
                case 4: kshitiz.destroy();
                break;
                case 5: break;
                default : System.out.println("Wrong Choice");
            }
        }while(ch!=5);
        System.out.println("kshitiz thapa");
    }
}
class Queue_KSHITIZ{
    int kshitiz[];
    int front, rear;
    Queue_KSHITIZ(){
        kshitiz = new int [100];
        front = rear = 1;
    }
    Queue_KSHITIZ(int size){
        kshitiz = new int[size];
        front = rear = -1;
    }
    void insert(int x){
        int p;
        p = (rear+1)% kshitiz.length;
        if(p == front)
            System.out.println("Queue Overflow ");
        else
        {
            rear = p;
            kshitiz[rear] = x;
            if(front == -1)
               front = 0;
        }
    }
    boolean empty()
    {
        if(front == -1)
            return true;
        else
            return false;
    }
    int delete(){
        int x = kshitiz[front];
        if(front == rear)
            front = rear = -1;
        else
            front =(front+1)% kshitiz.length;
        return x;
    }
    void display(){
        if(front == -1)
           System.out.println("Queue underflow");
        else{
            System.out.println("Elements of Queue are");
            int i = front;
            while(i != rear)
            {
                System.out.println(kshitiz[i]);
                i = (i+1)% kshitiz.length;
            }
            System.out.println(kshitiz[i]);
        }
    }
    void destroy(){
        front = rear=-1;
    }
}


