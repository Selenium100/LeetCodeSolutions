package Revision;

import java.util.Arrays;

public class InsertionSort3 {
	
	public static int[] insertionSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			int unsorted_ele = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>unsorted_ele) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = unsorted_ele;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,3,6,2,8,7};
		int[] sorted_arr = insertionSort(arr);
		System.out.println(Arrays.toString(sorted_arr));

	}

}
