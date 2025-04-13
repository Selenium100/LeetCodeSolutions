package Recursion;

import java.util.Arrays;

public class InsertElementToSortedArray {
	
	public static int[] insert(int[] sortedArr , int ele) {
		int n = sortedArr.length;
		
		int last = sortedArr[n-1];
		int j = n-2;
		
		while(j>=0 && sortedArr[j]>last) {
			sortedArr[j+1] = sortedArr[j];
			j--;
		}
		sortedArr[j+1] = last;
		return sortedArr;
	}
	
	

	public static void main(String[] args) {
		
		int[] arr = {3,5,6,7};
		int ele = 4;
		int[] sorted = insert(arr, ele);
		System.out.println(Arrays.toString(sorted));

	}

}
