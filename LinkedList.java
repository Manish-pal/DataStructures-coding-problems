import java.util.*;


/*
Program to remove duplicates elements/Nodes from Linked List (Linked List is inserted in decending order)
*/
public class LinkedList {
    
    Node head;
    class Node {
        
        int data;
        Node next;
        
        Node(int d) {
            
            data = d;
            next = null;
        }
    }
    
    void push(int d) {
        
        Node new_node = new Node(d);
        
        new_node.next = head;
        head = new_node;
        
    }
    
    void removeDuplicates() {
        
        Node Curr = head;
        
        while(Curr != null) {
            
            Node temp = Curr;
            while(temp != null && temp.data == Curr.data) {
                
                temp = temp.next;
            }
            Curr.next = temp; //links the current's next to the non-repeating.
            Curr = Curr.next; //increments the current position.
        }
    }
    
    void printList() {
        
        Node curr = head;
        while(curr != null) {
            
            System.out.print(" "+curr.data);
            curr = curr.next;
        }
        
        System.out.print(" ");
    }
    
    public static void main(String...args) {
        
        
        LinkedList llist = new LinkedList();

        llist.push(17);
        llist.push(16);
        llist.push(16);
        llist.push(15);
        llist.push(15);
        llist.push(12);
        llist.push(12);
        llist.push(11);
        llist.push(10);
        llist.push(10);

        System.out.println("Before Removing the duplicates from Linked List.");
        llist.printList();
        System.out.println();
        
        System.out.println("After Removing the duplicates");
        llist.removeDuplicates();
        llist.printList();
    }
    
}
