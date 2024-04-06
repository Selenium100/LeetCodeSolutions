package Sort;

import java.util.Arrays;

public class SelectionSort {

	public static int[] selectionSort(int[] arr) {

		int minValueIndex = -1;
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			minValueIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minValueIndex] > arr[j]) {
					minValueIndex = j;
				}
			}

			temp = arr[minValueIndex];
			arr[minValueIndex] = arr[i];
			arr[i] = temp;
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 3, 9, 1 };
		int[] sorted_arr = selectionSort(arr);
		System.out.println(Arrays.toString(sorted_arr));

	}

}
