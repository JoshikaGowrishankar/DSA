package addon;
import java.util.Scanner;

public class Day3_postassignment {
	Node head;
	

	class Node {
	    int data;
	    Node next;
	    
	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	        System.out.println("Inserted " + data);
	    }

	   
	    public void delete(int key) {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        if (head.data == key) {
	            head = head.next;
	            System.out.println("Deleted " + key);
	            return;
	        }

	        Node current = head;
	        Node prev = null;
	        while (current != null && current.data != key) {
	            prev = current;
	            current = current.next;
	        }

	        if (current == null) {
	            System.out.println("Element not found");
	            return;
	        }

	        prev.next = current.next;
	        System.out.println("Deleted " + key);
	    }

	   
	    public void traverse() {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        Node temp = head;
	        System.out.print("Linked List: ");
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }
	


	    public static void main(String[] args) {
	        Day3_postassignment list = new Day3_postassignment();
	        Scanner sc = new Scanner(System.in);
	        int choice, value;

	        do {
	            System.out.println("\n--- Singly Linked List Menu ---");
	            System.out.println("1. Insert");
	            System.out.println("2. Delete");
	            System.out.println("3. Traverse");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert: ");
	                    value = sc.nextInt();
	                    list.insert(value);
	                    break;

	                case 2:
	                    System.out.print("Enter value to delete: ");
	                    value = sc.nextInt();
	                    list.delete(value);
	                    break;

	                case 3:
	                    list.traverse();
	                    break;

	                case 4:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
	}


