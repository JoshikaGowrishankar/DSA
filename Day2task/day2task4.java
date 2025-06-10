package addon;

public class day2task4 {
	  public static int removeDuplicates(int[] nums) {
	        if (nums.length == 0)
		{
	        	return 0;
	        }
		  int i = 0;
		  for (int j = 1; j < nums.length; j++) {
	            if (nums[i] != nums[j]) {
	                i++;
	                nums[i] = nums[j];
		    }
	        }
		  return i + 1; 
	  }
	public static void main(String[] args) {
	        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
		int newLength = removeDuplicates(nums);
		System.out.println("Array after removing duplicates:");
	        for (int i = 0; i < newLength; i++)
			{
				System.out.print(nums[i] + " ");
			}
	}
}

	


