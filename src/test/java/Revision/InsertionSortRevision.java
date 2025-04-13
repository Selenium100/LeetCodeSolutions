package Revision;

import java.util.Arrays;

public class InsertionSortRevision {
	
	public static int[] insertionSort(int[] arr) {
		int length = arr.length;
		
		for(int i=1;i<length;i++) {
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
		int[] arr = {3,1,5,5,6,7};
		int[] sorted_arr = insertionSort(arr);
		System.out.println(Arrays.toString(sorted_arr));

	}

}
