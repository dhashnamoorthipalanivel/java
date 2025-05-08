// Linked list 2 => Insert at Beginenning
package java.DataStructure;

import java.util.*;

// Node class
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class singleLinkedList {
    Node head;
    Node current;

    //	Insert at Begin 
	void insertNodeAtBegininning(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			current = newNode;
		}else {
			newNode.next = head;
			head = newNode;
			current = newNode;
		}
	}

    // Display
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        singleLinkedList sll = new singleLinkedList();

        // Add element in linked list
        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            } else {
                sll.insertNodeAtBegininning(n);
            }
        }

        sll.display();
        sc.close();
    }
}
