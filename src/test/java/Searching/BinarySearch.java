package Searching;

public class BinarySearch {

	public static int binarySearch(int[] arr, int num) {
		int left = 0;
		int right = arr.length - 1;
		

		while (left <= right) {
			int middle = (left + right) / 2;
			if (arr[middle] == num) {
				return middle;
			} else if (arr[middle] > num) {
				right = middle - 1; //4>3 so right ko niche lao. right = middle -1;
			} else {
				left = middle + 1; 
			}
		}
		return -1;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int num = 3;

		System.out.println(binarySearch(arr, num));

	}

}
