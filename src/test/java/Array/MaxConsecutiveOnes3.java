package Array;

/**
 * 
 * @author Nitya
 * 
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 * 
 * link - https://leetcode.com/problems/max-consecutive-ones-iii/description/
 * 
 * Intuition
 * ------------
 * 1. make to pointers left and right and start from 0;
 * 2. make a variable for finalAns and initiate it to 0 initially.
 * 2. create a zero_count variable and keep track of zeros
 * 3. increment left pointer and check if any point you get zero then keep its track by increase zero_count++
 * 4. Also check the window size is valid or not. increase the left counter until zero_count>k and while increasing left point if element you find is 0, then do zero_count--
 * 5. Now check the maximum between finalAns and window size.
 * 6. Return finalAns
 *
 */

public class MaxConsecutiveOnes3 {
	
	public static int maxOnes(int[] arr, int k) {
		int length = arr.length;
		int left = 0;
		int zero_count = 0; 
		int final_ans = 0;
		
		for(int right=0;right<length;right++) {
			if(arr[right] == 0) {
				zero_count++;
			}
			
			// check valid window
			while(zero_count>k) {
				if(arr[left]==0) {
					zero_count--;
				}
				left++;
			}
			
			final_ans = Math.max(final_ans, right-left+1);
		}
		
		return final_ans;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
		int k =2;
		
		System.out.println(maxOnes(arr, k));
		

	}

}
