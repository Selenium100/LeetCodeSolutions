package practice;

public class MaximumSubArraySum {
	
	public static int maxSubArraySum(int[] arr, int k) {
		int size = arr.length;
		int start = 0;
		int end = 0;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		while(end<size) {
			sum = sum + arr[end];
			
			if(end-start+1<k) {
				end++;
			}else if(end-start+1 == k) {
				max = Math.max(sum, max);
				sum = sum - arr[start];
				start++;
				end++;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		int[] arr = {3, 5, -2, 10, -5, 7};  //6,13,3,12
		int max = maxSubArraySum(arr, 3);
		System.out.println(max);

	}

}
