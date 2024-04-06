package Revision;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	
	public static int[] mergedArray(int[] arr1,int[] arr2, int m,int n) {
		int[] ans = new int[m+n];
		
		int left = 0;
		int right = 0;
		int index = 0;
		
		while(left<m && right<n) {
			if(arr1[left]<arr2[right]) {
				ans[index] = arr1[left];
				left++;
				index++;
			}else{
				ans[index] = arr2[right];
				right++;
				index++;
			}
		}
		
		while(left<m) {
			ans[index] = arr1[left];
			left++;
			index++;
		}
		
		while(right<n) {
			ans[index] = arr2[right];
			right++;
			index++;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		
		int[] arr1 = {};
		int[] arr2 = {};
		int m = arr1.length;
		int n = arr2.length;
		
		int[] merged_array =  mergedArray(arr1, arr2, m, n);
		System.out.println(Arrays.toString(merged_array));

	}

}
