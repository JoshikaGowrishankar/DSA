package addon;

import java.util.Arrays;
import java.util.Scanner;

public class day2task2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=sc.nextInt();
		int num[]=new int[n];
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(num));
			int num1[]=new int[n];
		for(int i=0;i<num.length;i++) {
			num1[i]=num[i];
		}
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num1.length;j++) {
				if(num1[i]>num1[j]) {
					int temp=num1[i];
					num1[i]=num1[j];
					num1[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(num1));
	}
}
