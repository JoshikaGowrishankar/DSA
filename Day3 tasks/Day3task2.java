package addon;

public class Day3task2 {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int num){
			data=num;
			}
		}
	public void insert(int num) {
		Node newNode=new Node(num);
		if(head==null) {
			head=newNode;
			newNode.next=null;
			}
		else
		{
			newNode.next=head;
			head=newNode;
			}
		}
			public void display(){
				Node newNode=head;
				while(newNode.next!=null)
				{
					System.out.println(newNode.data);
					newNode=newNode.next;
					}System.out.println(newNode.data);
					}
			public static void main (String args[]) {
				Day3task2 list=new Day3task2();
				list.insert(15);
				list.insert(20);
				list.insert(25);
				list.display();
				}
			}

	