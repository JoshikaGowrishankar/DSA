package addon;

public class Day7task3 {
	

	    
	    public static void insertionSort(int[] arr) {
	        int n = arr.length;

	        
	        for (int i = 1; i < n; i++) {
	            int key = arr[i];  
	            int j = i - 1;

	        
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }

	           
	            arr[j + 1] = key;
	        }
	    }

	
	    public static void printArray(int[] arr) {
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	
	    public static void main(String[] args) {
	        int[] arr = {12, 11, 13, 5, 6};
	        System.out.println("Unsorted Array:");
	        printArray(arr);

	      
	        insertionSort(arr);

	        System.out.println("Sorted Array:");
	        printArray(arr);
	    }
	}



