 class SinglyLinkedListDeletion {  
    class Node_Kshitiz{  
        int data;  
        Node_Kshitiz next;  
  
        public Node_Kshitiz(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    public Node_Kshitiz head = null;  
    public Node_Kshitiz tail = null;  
    public void addNode_Kshitiz(int data) {  
        Node_Kshitiz newNode_Kshitiz = new Node_Kshitiz(data);  
  
        if(head == null) {  
            head = newNode_Kshitiz;  
            tail = newNode_Kshitiz;  
        }  
        else {  
            tail.next = newNode_Kshitiz;  
            tail = newNode_Kshitiz;  
        }  
    }  
  
    public void deleteFromStart() {  
  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            if(head != tail) {  
                head = head.next;  
            }  
            //then, it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
        }  
    }  
    public void deleteFromEnd() {  
  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            if(head != tail ) {  
                Node_Kshitiz current = head;  
                //Loop through the list till the second last element such that current.next is pointing to tail  
                while(current.next != tail) {  
                    current = current.next;  
                }  
                tail = current;  
                tail.next = null;  
            }  
  
            else {  
                head = tail = null;  
            }  
        }
    }
    public void deleteNode_KshitizAtPostion(int position)
    {
        if (head == null)
            return;

        
        Node_Kshitiz temp = head;

        if (position == 0)
        {
            head = temp.next;   
            return;
        }

 
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;

        Node_Kshitiz next = temp.next.next;

        temp.next = next;  // Unlink the deleted Node_Kshitiz from list
    }
    public void display() {  
        
        Node_Kshitiz current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        SinglyLinkedListDeletion sList = new SinglyLinkedListDeletion();  
  
        //Adds data to the list  
        sList.addNode_Kshitiz(1);  
        sList.addNode_Kshitiz(2);  
        sList.addNode_Kshitiz(3);  
        sList.addNode_Kshitiz(4);  
        sList.addNode_Kshitiz(5);
        sList.addNode_Kshitiz(6);
        sList.addNode_Kshitiz(7);
        sList.addNode_Kshitiz(8);
        //Printing original list  
        System.out.println("Original List: ");  
        sList.display();  
   
            sList.deleteFromStart();  
            System.out.println("Updated List after deletion from start: ");  
            sList.display();  
            sList.deleteFromEnd();  
            System.out.println("Updated List after deletion from end: ");  
            sList.display();
            sList.deleteNode_KshitizAtPostion(3);  
            System.out.println("Updated List after deletion at postion 3: ");  
            sList.display();
            System.out.println("kshitiz,B,08");
    }  
}
