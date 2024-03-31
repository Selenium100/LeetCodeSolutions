package Array;

import java.util.Arrays;

/**
 * 
 * @author Nitya
 * 
 * Link - https://leetcode.com/problems/shortest-unsorted-continuous-subarray/description/
 * 
 * Given an integer array nums, you need to find one continuous subarray such that if you only sort this subarray in non-decreasing order, then the whole array will be sorted in non-decreasing order.

   Return the shortest such subarray and output its length.
 *
 */

public class ShortedUnsortedContinuousSubarray {
	
	public static int findUnsortedSubArray(int[] arr) {
		int length = arr.length;
		int[] unsorted_array = new int[length];
		
		for(int i=0;i<length;i++) {
			unsorted_array[i] = arr[i];
		}
		
		Arrays.sort(arr);
		
		int start = -1;
		int end = -2;
		
		for(int i=0;i<length;i++) {
			if(unsorted_array[i] != arr[i]) {
				if(start == -1) {
					start = i;
				}else {
					end = i;
				}
				
			}
		}
		
		return end-start+1;
	}

	public static void main(String[] args) {
		
		int[] arr = {2,6,4,8,10,9,15};
		System.out.println(findUnsortedSubArray(arr));

	}

}
