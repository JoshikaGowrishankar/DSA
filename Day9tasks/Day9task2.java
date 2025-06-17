package addon;

public class Day9task2 {
	
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

	    public static void main(String[] args) {
	        int[] sortedArr = {1, 3, 3, 5, 7, 9};
	        int target = 3;

	        int index = upperBound(sortedArr, target);

	        if (index < sortedArr.length) {
	            System.out.println("Upper bound for " + target + " is at index: " + index +
	                               ", value: " + sortedArr[index]);
	        } else {
	            System.out.println("No upper bound found for " + target);
	        }
	    }
	}



