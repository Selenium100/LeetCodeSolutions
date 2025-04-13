package RoughPractice;

import java.util.Arrays;

public class BubbleSortPractice {
	
	public static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		int temp =0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]  = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {3,0,4,1,8,-1};
		int[] sortedArr = bubbleSort(arr);
		System.out.println(Arrays.toString(sortedArr));
	}

}
