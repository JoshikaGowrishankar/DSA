package addon;

public class Day6task1 {
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
			Day6task1 d=new Day6task1();
			d.push(5);
			d.push(10);
			d.push(15);
			d.push(20);
			d.push(25);
			d.pop();
			d.display();
			}
		}
	








