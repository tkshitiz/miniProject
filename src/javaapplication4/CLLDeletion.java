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
public class CLLDeletion {
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
   public int size;  
    //Declaring head and tail pointer as null.  
    public Node head = null;  
    public Node tail = null;  
      
    //This function will add the new node at the end of the list.  
    public void add(int data){  
        //Create new node  
        Node newNode = new Node(data);  
        //Checks if the list is empty.  
        if(head == null) {  
             //If list is empty, both head and tail would point to new node.  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            //tail will point to new node.  
            tail.next = newNode;  
            //New node will become new tail.  
            tail = newNode;  
            //Since, it is circular linked list tail will point to head.  
            tail.next = head;  
        }  
        //Counts the number of nodes in list  
        size++;  
    }  
    public void deleteStart() {  
        //Checks whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {  
            //Checks whether contain only one element  
            //If not, head will point to next element in the list and tail will point to new head.  
            if(head != tail ) {  
                head = head.next;  
                tail.next = head;  
            }  
            //If the list contains only one element   
            //then it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
        }  
    }  
      
    //Deletes node from end of the list  
    public void deleteEnd() {  
        //Checks whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {  
            //Checks whether contain only one element  
            if(head != tail ) {  
                Node current = head;  
                //Loop will iterate till the second last element as current.next is pointing to tail  
                while(current.next != tail) {  
                    current = current.next;  
                }  
                //Second last element will be new tail  
                tail = current;  
                //Tail will point to head as it is a circular linked list  
                tail.next = head;  
            }  
            //If the list contains only one element   
            //Then it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
        }  
    }  
    public void deleteNodeAtPostion(int position) {  
        Node current, temp;  
        //Checks whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {   
            //Checks whether head is equal to tail or not, if yes then list has only one node.  
            if( head != tail ) {  
                //Initially temp will point to head;  
                temp = head;  
                current = null;  
                //Current will point to node previous to temp  
                //If temp is pointing to node 2 then current will points to node 1.  
                for(int i = 0; i < position; i++){  
                    current = temp;  
                    temp = temp.next;  
                }  
                  
                if(current != null) {  
                    //temp is at position that needs to be removed.  
                    //So, current node will point to node next to temp by skipping temp.  
                    current.next = temp.next;  
                    //Delete temp;  
                    temp = null;  
                }  
                //Current points to null then head and tail will point to node next to temp.  
                else {  
                    head = tail = temp.next;  
                    tail.next = head;  
                    //Delete temp;  
                    temp = null;  
                }  
                  
            }  
            //If the list contains only one element   
            //then it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
        }  
        size--;  
    }  
    //Displays all the nodes in the list  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
             do{  
                //Prints each node by incrementing pointer.  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
      
    public static void main(String[] args) {  
        CLLDeletion cl = new CLLDeletion();  
        //Adds data to the list  
        cl.add(1);  
        cl.add(2);  
        cl.add(3);  
        cl.add(4); 
        cl.add(5); 
        cl.add(6);
        cl.add(7);
        cl.add(8);
        //Printing original list  
        System.out.println("Original List: ");  
        cl.display(); 
        cl.deleteStart();  
            //Printing updated list  
            System.out.println("Updated List after deletion from start: ");  
            cl.display();  
            cl.deleteEnd();  
            //Printing updated list  
            System.out.println("Updated List after deletion from end: ");  
            cl.display();
            cl.deleteNodeAtPostion(3);  
            //Printing updated list  
            System.out.println("Updated List after deletion from position 3: ");  
            cl.display();  
            System.out.println("kshitiz,08,B");
    }    

}
