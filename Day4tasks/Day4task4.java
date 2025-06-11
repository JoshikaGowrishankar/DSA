package addon;

public class Day4task4 {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int num){
			data=num;
			}}
		public void insert(int num) {
			Node newNode=new Node(num);
			if(head==null) {
				head=newNode;
				newNode.next=null;
				newNode.prev=null;
			}
			else {
				newNode.next=head;
				head.prev=newNode;
				head=newNode;
			}
		}
		public void display() {
			Node temp=head;
			while(temp.next!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}System.out.println(temp.data);}
		public void traverse() {
			 if (head == null) return;

		       
		        Node temp = head;
		        while (temp.next != null) {
		            temp = temp.next;
		        }

		       
		        while (temp != null) {
		            System.out.print(temp.data + " ");
		            temp = temp.prev;
		        }
		        System.out.println();
		    }

		    public static void main(String[] args) {
		        Day4task4 list = new Day4task4();
		        list.insert(10);
		        list.insert(20);
		        list.insert(30);

		        System.out.print("Traverse forward: ");
		        list.display();          

		        System.out.print("Traverse backward: ");
		        list.traverse(); 
		    }
		}
			
			
			
			
		
		
		
