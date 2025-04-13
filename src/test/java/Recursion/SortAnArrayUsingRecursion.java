package Recursion;

import java.util.Arrays;

public class SortAnArrayUsingRecursion {
	
	public static void sort(int[] arr, int n) {
		if(n<=0) {
			return;
		}
		
		sort(arr,n-1);
		int last = arr[n-1];
		int j = n-2;
		
		while(j>=0 && arr[j]>last) {
			arr[j+1] = arr[j];
			j--;
		}
		
		arr[j+1] = last;
	}

	public static void main(String[] args) {
		
		int[] arr = {3,4,1,2,6,5,9};
		sort(arr, 7);
		System.out.println(Arrays.toString(arr));

	}

}
