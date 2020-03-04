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
public class SinglyLinkedListDeletion {
        class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    //Represent the head and tail of the singly linked list  
    public Node head = null;  
    public Node tail = null;  
  
    //addNode() will add a new node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode will become new tail of the list  
            tail = newNode;  
        }  
    }  
  
    //deleteFromStart() will delete a node from the beginning of the list  
    public void deleteFromStart() {  
  
        //Checks if the list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            //Checks whether the list contains only one node  
            //If not, the head will point to next node in the list and tail will point to the new head.  
            if(head != tail) {  
                head = head.next;  
            }  
            //If the list contains only one node  
            //then, it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
        }  
    }  
     //deleteFromEnd() will delete a node from end of the list  
    public void deleteFromEnd() {  
  
        //Checks if the list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            //Checks whether the list contains only one element  
            if(head != tail ) {  
                Node current = head;  
                //Loop through the list till the second last element such that current.next is pointing to tail  
                while(current.next != tail) {  
                    current = current.next;  
                }  
                //Second last element will become new tail of the list  
                tail = current;  
                tail.next = null;  
            }  
            //If the list contains only one element  
            //Then it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
        }
    }
    public void deleteNodeAtPostion(int position)
    {
        // If linked list is empty
        if (head == null)
            return;

        // Store head node
        Node temp = head;

        // If head needs to be removed
        if (position == 0)
        {
            head = temp.next;   // Change head
            return;
        }

    // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;

       // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;

        // Node temp-&gt;next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        temp.next = next;  // Unlink the deleted node from list
    }
    //display() will display all the nodes present in the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        SinglyLinkedListDeletion sList = new SinglyLinkedListDeletion();  
  
        //Adds data to the list  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(4);  
        sList.addNode(5);
        sList.addNode(6);
        sList.addNode(7);
        sList.addNode(8);
        //Printing original list  
        System.out.println("Original List: ");  
        sList.display();  
   
            sList.deleteFromStart();  
            //Printing updated list  
            System.out.println("Updated List after deletion from start: ");  
            sList.display();  
            sList.deleteFromEnd();  
            //Printing updated list  
            System.out.println("Updated List after deletion from end: ");  
            sList.display();
            sList.deleteNodeAtPostion(3);  
            //Printing updated list  
            System.out.println("Updated List after deletion at postion 3: ");  
            sList.display();
            System.out.println("kshitiz,B,08");
    }  

}
