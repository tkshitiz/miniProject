/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

    import java.util.Scanner;
    public class kshitiz_linear_queue {
        int queue[], size, front, rear;

        public kshitiz_linear_queue(int kshitiz) {
              size = kshitiz;
              queue = new int[size];
              front = rear = -1;
        }

        public int enqueue_kshitiz(int kshitiz) {
            if(front == -1)
                  ++front;
              return queue[++rear] =kshitiz;
        }

        public int dequeue_kshitiz() {
            return queue[front++];
        }

        public int peek_kshitiz() {
              return queue[front];
        }

        public void display_kshitiz() {
              for(int i=front; i<=rear; i++)
                  System.out.printf("%5d", queue[i]);
              System.out.println();
        }

        public boolean isEmpty_kshitiz() {
            return (front == rear + 1 || (front == -1 && rear == -1));
        }

        public boolean isFull_kshitiz() {
            return rear == size - 1;
        }

    }


    class kshitiz {

        public static void main(String[] args) {

              Scanner kshitiz2 = new Scanner(System.in);

              System.out.print("\n Enter the length of queue : ");
              int size = kshitiz2.nextInt();

             kshitiz_linear_queue kshitiz1 = new kshitiz_linear_queue(size);

              while(true) {
                  System.out.println("\n 1. Enqueue \n 2. Dequeue \n 3."
                          + " Peek \n 4. display \n Press 0 for exit.");
                  System.out.print("\n Enter your choice : ");
                  int kshitiz3 = kshitiz2.nextInt();
                  switch(kshitiz3) {
                       case 0:                     
                           return;

                       case 1:
                        boolean full = kshitiz1.isFull_kshitiz();
                        if(full) {
                            System.out.println(" Queue is Full.");
                            break;
                        }
                        System.out.print(" Enter the Element to Enqueue : ");
                        int enqueue = kshitiz1.enqueue_kshitiz(kshitiz2.nextInt());
                        System.out.println(" Enqueue Item : " + enqueue);
                           break;

                       case 2:
                        boolean empty = kshitiz1.isEmpty_kshitiz();
                        if(empty) {
                            System.out.println(" Queue is Empty.");
                            break;
                        }
                        int dequeue = kshitiz1.dequeue_kshitiz();
                        System.out.println(" Dequeue Item : " + dequeue);
                           break;

                       case 3:
                        boolean emp = kshitiz1.isEmpty_kshitiz();
                        if(emp) {
                            System.out.println(" Queue is Empty.");
                            break;
                        }
                        int peek = kshitiz1.peek_kshitiz();
                        System.out.println(" Front Element : " + peek);
                           break;

                       case 4:
                        boolean e = kshitiz1.isEmpty_kshitiz();
                        if(e) {
                            System.out.println(" Queue is Empty.");
                            break;
                        }
                           kshitiz1.display_kshitiz();
                           break;

                       default:
                    System.out.println("\n Wrong Choice Entered. ");
                  }
                    System.out.println("kshitiz thapa");


        }


        }
    }


