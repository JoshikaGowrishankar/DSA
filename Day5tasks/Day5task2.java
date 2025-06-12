package addon;

public class Day5task2 {
	class Node {
	    int data;
	    Node next;
	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	Node tail; 
	    public Day5task2() {
	        tail = null;
	    }
	    public void insertAtTail(int data) {
	        Node newNode = new Node(data);
	        if (tail == null) {
	             tail = newNode;
	            tail.next = tail;
	        } else {
	             newNode.next = tail.next;
	             tail.next = newNode;
	             tail = newNode;
	        }
	    }
	    public void printList() {
	        if (tail == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        Node current = tail.next;  
	        do {
	            System.out.print(current.data + " ");
	            current = current.next;
	        } while (current != tail.next);

	        System.out.println();
	    }
	    public static void main(String[] args) {
	 Day5task2 list = new  Day5task2();
	 list.insertAtTail(1);
	 list.insertAtTail(2);
	 list.insertAtTail(3);
	 list.printList(); 
	    }
	}

	


