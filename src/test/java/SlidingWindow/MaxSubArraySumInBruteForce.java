package SlidingWindow;

public class MaxSubArraySumInBruteForce {
	
	public static int maxSubArraysSum(int[] arr, int k) {
		int n = arr.length;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<=n-k;i++) {
			sum = 0;
			for(int j=i;j<i+k;j++) {
				sum += arr[j];
			}
			max = Math.max(max, sum);
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		int[] arr = {3,5,2,-1,4,-2,7};  //10,6,5,1,9
		int max = maxSubArraysSum(arr, 3);
		System.out.println(max);
	}

}
