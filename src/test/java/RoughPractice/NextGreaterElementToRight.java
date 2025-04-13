package RoughPractice;

import java.util.Arrays;

public class NextGreaterElementToRight {
	
	public static int[] nextGreaterElementRight(int[] arr) {
		
		int[] res = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					res[i] = arr[j];
					break;	
				}
				
				res[arr.length-1] = -1;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,1};
		int[] result = nextGreaterElementRight(arr);
		
		System.out.println(Arrays.toString(result));

	}

}
