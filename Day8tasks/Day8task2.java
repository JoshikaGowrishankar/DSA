package addon;

import java.util.Arrays;

public class Day8task2 {
	public static void main(String []args) {
		int i,j=0;
		        int[] num = {23, 56, 34, 90, 55, 12, 78};
		        System.out.println("Original array: " + Arrays.toString(num));
		        for ( i = 0; i < num.length - 1; i++) {
		            for ( j = 0; j < num.length - i - 1; j++) {
		                if (num[j] > num[j + 1]) {
		                    int temp = num[j];
		                    num[j] = num[j + 1];
		                    num[j + 1] = temp;
		                }
		            }
		        }

		      
				System.out.println("Sorted array (Ascending): " +Arrays.toString(num));
				
		    }
		}

		
		
	


