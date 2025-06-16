package addon;

import java.util.Scanner;

public class Day8task1 {
	public static void main(String args[]) {
		int num[]= {32,67,90,3,45};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num to find:");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<num.length;i++) {
			if(num[i]==n) {
				System.out.println("Value found at the index:"+i);
				flag=true;
				break;
				
			}
			}
		if(flag==false) {
				System.out.println("value not found");
			}
			
		}
	}


