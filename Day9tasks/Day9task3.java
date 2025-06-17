package addon;

public class Day9task3 {
	

	  
	    public static int lowerBound(int[] arr, int target) {
	        int left = 0, right = arr.length;
	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return left;
	    }

	   
	    public static int upperBound(int[] arr, int target) {
	        int left = 0, right = arr.length;
	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] <= target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return left;
	    }

	   
	    public static int countOccurrences(int[] arr, int target) {
	        return upperBound(arr, target) - lowerBound(arr, target);
	    }

	    public static void main(String[] args) {
	        int[] sortedArray = {1, 2, 2, 2, 3, 4, 5, 5, 6};
	        int target = 2;

	        int count = countOccurrences(sortedArray, target);
	        System.out.println("The number " + target + " occurs " + count + " times.");
	    }
	}



