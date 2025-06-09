package addon;

public class day2task3 {
	public static boolean isPalindrome(String str) {
	    	str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	    	int left = 0;
	        int right = str.length() - 1;
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right))
	            {
	                return false; 
	            }
	              left++;
	              right--;
	        }
                return true; 
	    }
	    public static void main(String[] args) {
	        String input = "Sir";
	        if (isPalindrome(input)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not a palindrome");
	        }
	    }
	}



