package Array;

/**
 * 
 * @author Nitya
 * 
 * Given a integer array nums, find the subaray with largest sum.
 * 
 * Intution
 * ----------
 * 1. Create a bag and keep the numbers one by one and sum it.
 * 2. Everytime keep the track of largest sum.
 * 3. If bag sum is negetive anytime then make bag sum as zero.
 * 4. Return the tracked largest sum.
 *
 */

public class MaximuxSubArray {
	
	public static int maxSum(int[] nums) {
		int curr_sum = 0;
		int final_ans = Integer.MIN_VALUE;
		int length = nums.length;
		
		for(int i=0;i<length;i++) {
			curr_sum+= nums[i];
			
			if(final_ans<curr_sum) {
				final_ans= curr_sum;  // or we can do final_ans = Math.max(curr_sum,final_ans);
			}
			
			if(curr_sum<0) {
				curr_sum = 0;
			}
		}
		return final_ans;
	}

	public static void main(String[] args) {
		
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSum(nums));

	}

}
