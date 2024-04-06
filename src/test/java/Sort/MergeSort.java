package Sort;

import java.util.Arrays;

public class MergeSort {

	public static int[] mergeSort(int[] arr) {
		int length = arr.length;

		// Base Condition
		if (length == 1) {
			return arr;
		}

		int[] left = Arrays.copyOfRange(arr, 0, length / 2);
		int[] right = Arrays.copyOfRange(arr, length / 2, length);

		left = mergeSort(left);
		right = mergeSort(right);

		return mergeSortedArrays(left, right);
	}

	private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int[] ans = new int[m + n];

		int left = 0;
		int right = 0;
		int index = 0;

		while (left < m && right < n) {
			if (arr1[left] <= arr2[right]) {
				ans[index] = arr1[left];
				index++;
				left++;
			} else {
				ans[index] = arr2[right];
				index++;
				right++;
			}
		}

		while (left < m) {
			ans[index] = arr1[left];
			left++;
			index++;
		}

		while (right < n) {
			ans[index] = arr2[right];
			index++;
			right++;
		}

		return ans;

	}

	public static void main(String[] args) {

		int[] arr = { 9, 3, 6, 2, 5, 1, 4 };
		int[] sorted_arr = mergeSort(arr);
		System.out.println(Arrays.toString(sorted_arr));

	}

}
