package Array;

import java.util.Arrays;

public class TwoSum {
	
	public static boolean isSumExists(int[] arr, int sum) {
		Arrays.sort(arr);
		int length = arr.length;
		int start = 0;
		int end = length-1;
		while(start<end) {
			if(arr[start]+arr[end] == sum) {
				return true;
			}else if(arr[start]+arr[end]>sum) {
				end--;
			}else {
				start++;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		int [] arr = {10, 20, 35, 50, 75, 80};
		int sum = 70;
		
		System.out.println(isSumExists(arr, sum));

	}

}
