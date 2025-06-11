package addon;

public class Day4task1 {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int num){
		data=num;
	}
	}
	public void insert(int num) {
		Node newNode=new Node(num);
		if(head==null) {
			head=newNode;
			newNode.next=null;
		    newNode.prev=null;
		}else {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
			}
		}
	public void display()
	{
		Node temp=head;
		while(temp.next!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}System.out.println(temp.data);
	}
	public static void main (String args[]) {
		Day4task1 list=new Day4task1();
		list.insert(5);
		list.insert(10);
		list.insert(15);
		list.insert(20);
		list.insert(25);
		list.display();
	}}
	