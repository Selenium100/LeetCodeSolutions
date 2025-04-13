package RoughPractice;

import java.util.Arrays;

public class SelectionSortPractice2 {
	
	public static int[] selectionSort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {3,0,4,1,8,-1}; 
		int[] sortedArr = selectionSort(arr);
		System.out.println(Arrays.toString(sortedArr));

	}

}
