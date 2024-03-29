package Array;

/**
 * 
 * @author Nitya
 * 
 * Link - https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/
 * 
 * Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] (i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].

   Return the maximum difference. If no such i and j exists, return -1.
   
   Intuition
   ----------
   1. Let's suppose minimum till now element is nums[0]
   2. Iterate the array from 1 to length
   3. Check if nums[j]>min_till_now.
   4. if yes then find the finalAns = maximum betweeen finalAns and nums[j]-min_till_now.
   5. then update the min_till_now to minimum between nums[j] and min_till_now
 *
 */

public class MaxDifferenceBetweenIncreasingElements {
	
	public static int maxDiff(int[] arr) {
		int length = arr.length;
		int min_as_of_now = arr[0];
		int finalAns = -1;
		
		for(int j=1;j<length;j++) {
			if(arr[j]>min_as_of_now) {
				finalAns = Math.max(finalAns, arr[j]-min_as_of_now);
			}
			
			 min_as_of_now = Math.min(arr[j], min_as_of_now);
		}
		
		return finalAns;
	}

	public static void main(String[] args) {
		
		int[] arr = {7,1,5,4};
		System.out.println(maxDiff(arr));

	}

}
