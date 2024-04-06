package Array;

import java.util.Arrays;

public class InsertElementInSortedArray {
	
	public static int[] insertElement(int[] arr, int k) {
		int length = arr.length;
		
		int[] copyArray = new int[length+1];
		int index = 0;
		
		//find the index where element should be inserted.
		while(index<length && arr[index]<k) {
			index++;
		}
		
		for(int i=0;i<index;i++) {
			copyArray[i] = arr[i];
		}
		
		copyArray[index] = k;
		
		for(int i=index;i<length;i++) {
			copyArray[i+1] = arr[i];
		}
		
		return copyArray;
		
		
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,6,7,8,9};
		int k = 5;
		
		int[] ans = insertElement(arr, k);
		
		System.out.println(Arrays.toString(ans));

	}

}
