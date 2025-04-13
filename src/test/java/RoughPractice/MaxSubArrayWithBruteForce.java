package RoughPractice;

public class MaxSubArrayWithBruteForce {
	
	public static int maxSubArraySum(int[] arr, int k) {
		int size = arr.length;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<=size-k;i++) {
			sum = 0;
			for(int j=i;j<i+k;j++) {
				sum+= arr[j];
			}
			max = Math.max(max, sum);
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		int[] arr = {3, 5, -2, 10, -5, 7};
		int max = maxSubArraySum(arr, 3);
		System.out.println(max);

	}

}
