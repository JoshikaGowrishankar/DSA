package addon;

public class Day4task3 {
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
	 public void deleteMiddle() {
	        if (head == null) {
	            System.out.println("List is empty, nothing to delete.");
	            return;
	        }
	        if (head.next == null) {
	             head = null;
	            return;
	        }
	        Node slow = head;
	        Node fast = head;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        if (slow.prev != null) {
	            slow.prev.next = slow.next;
	        }
	        if (slow.next != null) {
	            slow.next.prev = slow.prev;
	        }
	        if (slow == head) {
	            head = slow.next;
	        }
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
	       Day4task3 list = new Day4task3();
	       list.insert(5);
	        list.insert(10);
	        list.insert(15);
	        list.insert(20);
	        list.insert(25);
	        System.out.println("Original list:");
	        list.display();
	        list.deleteMiddle();
	        System.out.println("After deleting middle node:");
	        list.display();
	    }
	}

