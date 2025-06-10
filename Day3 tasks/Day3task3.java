package addon;

public class day3task3 {
	
	    Node head;
	    class Node {
	        int data;
	        Node next;
	        Node(int d) { data = d; next = null; }
	    }
	    public void deleteAtPosition(int position) {
	    	if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        Node temp = head;
	        if (position == 0) {
	            head = temp.next; 
	            return;
	        }
	        for (int i = 0; temp != null && i < position - 1; i++) {
	            temp = temp.next;
	        }
	        if (temp == null || temp.next == null) {
	            System.out.println("Position out of bounds");
	            return;
	        }
	        Node next = temp.next.next;
	        temp.next = next; 
	    }
	    public void printList() {
	        Node tnode = head;
	        while (tnode != null) {
	            System.out.print(tnode.data + " ");
	            tnode = tnode.next;
	        }
	        System.out.println();
	    }
	    public void append(int new_data) {
	        Node new_node = new Node(new_data);
	        if (head == null) {
	            head = new_node;
	            return;
	        }
	        Node last = head;
	        while (last.next != null)
	            last = last.next;
	        last.next = new_node;
	    }
	    public static void main(String[] args) {
	        day3task3 llist = new day3task3();
	        llist.append(10);
	        llist.append(20);
	        llist.append(30);
	        llist.append(40);
	        System.out.println("Original List:");
	        llist.printList();
	        llist.deleteAtPosition(2); 
	        System.out.println("After Deletion at position 2:");
	        llist.printList();
	    }
	}



