package Revision;

import java.util.Arrays;

public class InsertionSort {
	
	public static int[] insersionSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			int curr_ele = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>curr_ele) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = curr_ele;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = {5,2,7,8,3};
		int[] sorted_arr = insersionSort(arr);
		System.out.println(Arrays.toString(sorted_arr));

	}

}
