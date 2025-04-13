package RoughPractice;

public class MaxSubArraySumWithSlidingWindow {
	
	public static int maxSubArraySum(int[] arr, int k) {
		int n = arr.length;
		int start = 0;
		int end = 0;
		int sum = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		
		while(end<n) {
			sum+=arr[end];
			if(end-start+1 == k) {
				max = Math.max(max, sum);
				sum= sum - arr[start];
				start++;
			}
			end++;
		}
		
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {3,4,-1,5,-2,7,8}; 
		int max = maxSubArraySum(arr, 3);
		System.out.println(max);

	}

}
