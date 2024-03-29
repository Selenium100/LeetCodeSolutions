package Revision;

/**
 * 
 * @author nitya
 * 
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 * 
 * link - https://leetcode.com/problems/max-consecutive-ones-iii/description/
 * 
 *
 */

public class MaxConsecutiveOne3 {
	
	public static int maxOne(int[] arr, int k) {
		int length = arr.length;
		int left = 0;
		int zero_count = 0;
		int finalAns = Integer.MIN_VALUE;
		
		for(int right=0;right<length;right++) {
			if(arr[right] == 0) {
				zero_count++;
			}
			
			//check valid window
			while(zero_count>k) {
				if(arr[left] == 0) {
					zero_count--;
				}
				left++;
			}
			
			finalAns = Math.max(finalAns, right-left+1);
		}
		
		return finalAns;
				
	}

	public static void main(String[] args) {
		

	}

}
