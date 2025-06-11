package addon;

public class Day5task1 {
	Node last;
	class Node{
		int data;
		Node next;
	
	 Node(int num){
	 data=num;
	 next=null;
	
}
	  
		
	}

	
	
	public void insert(int num) {
		Node newNode=new Node(num);
		if(last==null) {
			last=newNode;
			newNode.next=last;
			
		}
		else {
			last.next=newNode;
			newNode.next=last;
		}
		
	}

	public void display()
	{
		Node temp=last.next;
		while(temp!=last) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.print(temp.data);
		
	}
	public static void main(String args[]) {
		Day5task1 list=new Day5task1();
		list.insert(5);
		list.insert(10);
		list.insert(15);
		list.insert(20);
		list.display();
	}
	}
	

	
