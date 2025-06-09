package addon;

public class Day2postassignment {
	public static int[] TargetSum(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length - 1;
		while (left < right) {
			int currentSum = arr[left] + arr[right];
			if (currentSum == target) 
			{
	                return new int[]{arr[left], arr[right]};
	            } else if (currentSum < target) {
	                left++;  
			} else
			{
	                right--; 
			}
	        }
		return new int[]{};
	}
	public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 6};
	        int target = 6;
	        int[] result = TargetSum(arr, target);
		if (result.length == 2) {
	            System.out.println("Pair found: " + result[0] + " and " + result[1]);
	        } else
		{
	            System.out.println("No pair found.");
	        }
	}
}



