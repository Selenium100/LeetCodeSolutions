package RoughPractice;

import java.util.Arrays;

public class InsertionSortPractice3 {
	
	public static int[] insertionSort(int[] arr) {
		
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
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
		
		int[] arr =  {4,3,6,1,2,5};
		int[] sorted = insertionSort(arr);
		System.out.println(Arrays.toString(sorted));

	}

}
