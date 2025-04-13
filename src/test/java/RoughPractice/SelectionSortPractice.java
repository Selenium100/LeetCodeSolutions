package RoughPractice;

import java.util.Arrays;

public class SelectionSortPractice {
	
	public static int[] selectionSort(int[] arr) {
		int n = arr.length;
		
		for(int i=0;i<arr.length-1;i++) {
			int minIndex = i;
			for(int j =i+1;j<n;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
		
		
	}

	public static void main(String[] args) {
		int[] arr = {3,0,4,1,8,-1}; // -1,0,4,1,8,3   -1,0,1,4,8,3  -1,0,1,3,8,4  -1,0,1,3,4,8
		int[] sortedArr = selectionSort(arr);
		System.out.println(Arrays.toString(sortedArr));

	}

}
