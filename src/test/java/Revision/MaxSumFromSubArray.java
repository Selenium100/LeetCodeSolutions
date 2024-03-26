package Revision;

public class MaxSumFromSubArray {

	public static int maxSum(int[] arr, int k) {

		int length = arr.length;
		int wSum = 0;

		if (length < k) {
			return -1;
		}

		for (int i = 0; i < k; i++) {
			wSum += arr[i];
		}

		int mSum = wSum;

		for (int i = k; i < length; i++) {
			wSum += -arr[i - k] + arr[i];
			mSum = Math.max(wSum, mSum);
		}

		return mSum;
		
		

	}

	public static void main(String[] args) {

		int[] arr = { 2, 9, 31, -4, 21, 7 };

		System.out.println(maxSum(arr, 3));

	}

}
