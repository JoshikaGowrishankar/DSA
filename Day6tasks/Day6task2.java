package addon;

import java.util.Scanner;

public class Day6task2 {
	int mystack[]=new int[5];
	int top=-1;
	public void push(int num) {
		if(top==4) {
			System.out.println("Stack overflow");
		}else {
			mystack[++top]=num;
		}}
	public void pop() {
		if(top==-1) {
			System.out.println("Stack underflow");
		}else {
			mystack[top]=0;
			top--;
			}
		}
	public void display() {
		for (int i=0;i<mystack.length;i++) {
			System.out.println(mystack[i] +" ");
	}}
		public static void main(String args[]) {
			Day6task2 d=new Day6task2();
			Scanner sc=new Scanner(System.in);
			int choice;
			
			do {
				System.out.println("enter your choice: ");
				 System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
				 choice=sc.nextInt();
				switch(choice) {
				case 1:
					d.push(20);
				    break;
			    case 2:
			    	d.pop();
			        break;
			    case 3:
			    	d.display();
			        break;
			    case 4:
			    	System.out.println("Exit****");
			    default:
			    	System.out.println("Invalid");
			    	break;
				}
				}while (choice != 4);

				sc.close(); 
			
				    	
					
				}
			}
			




