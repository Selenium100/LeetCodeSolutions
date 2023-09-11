package Array;

import java.util.Arrays;

public class TwoSumWithTwoPointerApproach {

	public static void main(String[] args) {
		
		int[] arr = {5,8,9,7,3};
		int target = 8;
		
		System.out.println(Arrays.toString(twosum(arr,target)));

	}

	private static int[] twosum(int[] arr, int target) {
		
		int size = arr.length;
		int start = 0;
		int end = arr.length-1;
		
		for(int i=0;i<size;i++) {
			int expNum = arr[start]+arr[end];
			if(target<expNum) {
				end--;
			}else if(target>expNum) {
				start++;
			}else {
				return new int[] {start,end};
			}
		}
		return null;
	}

}
