package Revision;

import java.util.Arrays;

public class BubbleSort2 {
	
	public static int[] bubbleSort(int[] arr) {
		
		int temp =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = {5,8,2,3,1,4,7,9};
		int[] sorted_arr = bubbleSort(arr);
		System.out.println(Arrays.toString(sorted_arr));

	}

}
