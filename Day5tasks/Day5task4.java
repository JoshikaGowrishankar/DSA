package addon;

public class Day5task4 {class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = this;
    }
} Node head;
    public void deleteAtPosition(int pos) {
        if (head == null || pos <= 0) return;
        if (pos == 1) {
            if (head.next == head) {
                head = null; 
            } else {
                Node last = head;
                while (last.next != head) last = last.next;
                last.next = head.next;
                head = head.next;
            }
            return;
        }
        Node current = head;
        for (int i = 1; i < pos - 1; i++) {
            current = current.next;
            if (current == head) return;  
        } Node toDelete = current.next;
        if (toDelete == head) return; 
        current.next = toDelete.next;
    }
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != head) temp = temp.next;
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
    Day5task4 list = new Day5task4 ();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
  System.out.print("Original List: ");
  list.printList();
  list.deleteAtPosition(1); 
  System.out.print("After deleting position 1: ");
  list.printList();
  list.deleteAtPosition(2);
  System.out.print("After deleting position 2: ");
  list.printList();
    }
}

	


