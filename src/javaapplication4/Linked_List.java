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
 class Linked_List {
        Node_Kshitiz head;  
  
    
    class Node_Kshitiz 
    { 
        int data; 
        Node_Kshitiz next; 
        Node_Kshitiz(int d) {data = d; next = null; } 
    } 
  
    public void push(int new_data) 
    { 
        Node_Kshitiz new_Node_Kshitiz = new Node_Kshitiz(new_data); 
        new_Node_Kshitiz.next = head; 
  
        head = new_Node_Kshitiz; 
    } 
    public void insertAfter(Node_Kshitiz prev_Node_Kshitiz, int new_data) 
    { 
        if (prev_Node_Kshitiz == null) 
        { 
            System.out.println("The given previous Node_Kshitiz cannot be null"); 
            return; 
        } 
  
        Node_Kshitiz new_Node_Kshitiz = new Node_Kshitiz(new_data); 
  
        new_Node_Kshitiz.next = prev_Node_Kshitiz.next; 
  
 
        prev_Node_Kshitiz.next = new_Node_Kshitiz; 
    } 
     
    public void append(int new_data) 
    { 
        
        Node_Kshitiz new_Node_Kshitiz = new Node_Kshitiz(new_data); 
        if (head == null) 
        { 
            head = new Node_Kshitiz(new_data); 
            return; 
        } 
  
        new_Node_Kshitiz.next = null; 
  
       
        Node_Kshitiz last = head;  
        while (last.next != null) 
            last = last.next; 
  
        last.next = new_Node_Kshitiz; 
        return; 
    } 
  
   public void printList() 
    { 
        Node_Kshitiz tNode_Kshitiz = head; 
        while (tNode_Kshitiz != null) 
        { 
            System.out.println(tNode_Kshitiz.data); 
            tNode_Kshitiz = tNode_Kshitiz.next; 
        } 
    } 
  
    
public static void main(String[] args) 
    { 
        LinkedList llist = new LinkedList(); 
  
        llist.append(6); 
  
     
        
        llist.push(7); 
  
     
        llist.push(1); 
  
    
        llist.append(4); 
  
        llist.insertAfter(llist.head.next, 8); 
  
        System.out.println("\nCreated Linked list is: "); 
        llist.printList(); 
    } 

}
