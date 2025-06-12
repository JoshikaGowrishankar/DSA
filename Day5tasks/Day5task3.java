package addon;

public class Day5task3 {
	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = this; 
	    }
	} Node head;
	    public void deleteHead() {
	        if (head == null) {
	            return;
	        }
	        if (head.next == head) {
	            head = null;
	            return;
	        }
	        Node last = head;
	        while (last.next != head) {
	            last = last.next;
	        } last.next = head.next;
	        head = head.next;
	    }
	    public void add(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node temp = head;
	        while (temp.next != head) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	        newNode.next = head;
	    }
	    public void printList() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        Node temp = head;
	        do {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println("(head)");
	    }
	    public static void main(String[] args) {
	      Day5task3 list = new Day5task3();
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        System.out.print("Original list: ");
	        list.printList();
	        list.deleteHead();
	        System.out.print("After deleting head: ");
	        list.printList();
	    }
	}



