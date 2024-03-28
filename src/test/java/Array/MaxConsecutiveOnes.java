package Array;

/**
 * 
 * @author Nitya
 * 
 * [0,1,1,1,0,1,1,1,1,1,1,0,1]  Return the count of max consesutive ones.
 * 
 * We can solve it by Kedden's approach
 * 
 * 1. Iterate through the array and check if element is 1, then increment the current count.
 * 2. Create max_count and maintain it the highest count.
 * 3. if element is 0 then 
 * 
 *
 *
 */

public class MaxConsecutiveOnes {
	
	public static int maxConOnes(int[] arr) {
		int curr_count = 0;
		int max_count = Integer.MIN_VALUE;
		int length = arr.length;
		
		for(int i=0;i<length;i++) {
			if(arr[i] == 1) {
				curr_count++; 
			}
			
			max_count = Math.max(curr_count, max_count); 
			if(arr[i] == 0) {
				curr_count = 0;
			}
		}
		return max_count;
	}

	public static void main(String[] args) {
		
		int[] arr = {0,1,1,1,0,1,1,1,1,1,1,0,1};
		System.out.println(maxConOnes(arr));
	}

}
