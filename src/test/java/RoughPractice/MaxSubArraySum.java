package RoughPractice;

public class MaxSubArraySum {
	
	public static int maxSubArraySum(int[] arr, int k) {
		int n = arr.length;
		int sum = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<=n-k;i++) {
			sum = 0;
			for(int j=i;j<i+k;j++) {
				sum +=arr[j];
			}
			
			max = Math.max(max, sum);
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {3,4,-1,5,-2,7,8}; //6,8,2,10,13
		int max = maxSubArraySum(arr, 3);
		System.out.println(max);

	}

}
