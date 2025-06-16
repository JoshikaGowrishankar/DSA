package addon;

import java.util.Arrays;

public class Day7task1 {
	public static  void findbubble(int []num){
		int i=1,j=0;
		for( i=1;i<num.length;i++) {
			System.out.println(Arrays.toString(num));	
			for( j=0;j<num.length-1;j++) {
				if(num[j]>num[j+1]) {
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}System.out.println(num[j]+" ");
			}
	public static void main(String []args) {
		int number[]= {32,6,4,56,90,15};
	    findbubble(number);
		
	}}













