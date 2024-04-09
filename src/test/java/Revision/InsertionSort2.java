package Revision;

import java.util.Arrays;

public class InsertionSort2 {
	
	public static int[] insertionSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			int curr_ele = arr[i]; // start from 1th element
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
		
		int[] arr = {4,7,2,1,4,3,8};
		int[] sorted_arr =  insertionSort(arr);
		System.out.println(Arrays.toString(sorted_arr));

	}

}
