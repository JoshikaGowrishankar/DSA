package addon;

public class Day4task2 {
	
	    Node head;

	    class Node {
	        int data;
	        Node next;
	        Node prev;

	        Node(int num) {
	            data = num;
	        }
	    }

	    public void insert(int num) {
	        Node newNode = new Node(num);
	        if (head == null) {
	            head = newNode;
	        } else {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	    }

	    public void insertMiddle(int num) {
	        if (head == null) {
	         
	            head = new Node(num);
	            return;
	        }

	     
	        Node slow = head;
	        Node fast = head;

	        while (fast.next != null && fast.next.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	      
	        Node newNode = new Node(num);

	      
	        newNode.next = slow.next;
	        newNode.prev = slow;

	        if (slow.next != null) {
	            slow.next.prev = newNode;
	        }
	        slow.next = newNode;
	    }

	    public void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " <-> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }

	    public static void main(String[] args) {
	       Day4task2 list = new Day4task2();

	        list.insert(5);
	        list.insert(10);
	        list.insert(15);
	        list.insert(20);

	        System.out.println("Original list:");
	        list.display();

	        list.insertMiddle(99);

	        System.out.println("After inserting 99 in middle:");
	        list.display();
	    }
	}


