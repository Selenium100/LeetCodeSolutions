package Array;

import java.util.ArrayList;

/**
 * 
 * @author Nitya
 * 
 * Link - https://leetcode.com/problems/range-sum-query-immutable/description/
 * 
 * 
 *
 */

public class NumArray {
	
	ArrayList<Integer> prefixSum;
	
	public NumArray(int[] nums) {
		prefixSum = new ArrayList<Integer>();
		int sum = 0;
		
		for(Integer num:nums) {
			sum+=num;
			prefixSum.add(sum);
		}
		
	}
	
	public int sumRange(int left,int right) {
		if(left==0) {
			return prefixSum.get(right);
		}
		
		return prefixSum.get(right)-prefixSum.get(left-1);
	}

	public static void main(String[] args) {
		int[] nums = {4,-2,5,3,7};
		NumArray arr = new NumArray(nums);
		
		System.out.println(arr.sumRange(1, 3));

	}

}
