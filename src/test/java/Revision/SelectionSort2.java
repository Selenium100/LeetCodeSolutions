package Revision;

import java.util.Arrays;

public class SelectionSort2 {
	
	public static int[] selectionSort(int[] arr) {
		
		int temp =0;
		int minIndex = -1;
		for(int i=0;i<arr.length;i++) {
			 minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
		return arr;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {5,2,7,1,9,4};
		int[] sorted_arr = selectionSort(arr);
		System.out.println(Arrays.toString(sorted_arr));

	}

}
