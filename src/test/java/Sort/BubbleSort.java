package Sort;

import java.util.Arrays;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] arr) {
		
		int temp =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = {0,5,5,2,3,1};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr)); 

	}

}
