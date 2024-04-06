package Revision;

import java.util.Arrays;

public class SelectionSort {
	
	public static int[] selectionSort(int[] arr) {
		int temp =0;
		int minimumIndex = -1;
		for(int i=0;i<arr.length-1;i++) {
			 minimumIndex = i;
			for(int j =i+1;j<arr.length;j++) {
				if(arr[minimumIndex]>arr[j]) {
					minimumIndex = j;
				}
			}
			
			temp = arr[minimumIndex];
			arr[minimumIndex] = arr[i];
			arr[i] = temp;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = {5,2,7,3,8,9};
		int[] sorted_arr = selectionSort(arr);
		System.out.println(Arrays.toString(sorted_arr));

	}

}
