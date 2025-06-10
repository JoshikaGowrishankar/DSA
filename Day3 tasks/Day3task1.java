package addon;

public class Day3task1 {
	 class Node {
	        int data;
	        Node next;
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }
	    Node head = null;
	    public void insertAtPosition(int data, int position) {
	        Node newNode = new Node(data);
	        if (position == 0) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }
	        Node current = head;
	        for (int i = 0; i < position - 1; i++) {
	            if (current == null) {
	                System.out.println("Position out of bounds");
	                return;
	            }
	            current = current.next;
	        }
	        newNode.next = current.next;
	        current.next = newNode;
	    }
	    public void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	    public static void main(String[] args) {
	        Day3task1 list = new Day3task1();
	        list.insertAtPosition(10, 0); 
	        list.insertAtPosition(20, 1); 
	        list.insertAtPosition(15, 2); 

	        list.printList(); 
	    }
	}


