package Array;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {

		int[] arr = { 5, 0, 9, 7, 0, 2, 0, 4, 0, 0, 5 };
		System.out.println(Arrays.toString(moveZeros(arr)));

	}

	private static int[] moveZeros(int[] arr) {
		int size = arr.length;
		int nz = 0;
		int z = 0;

		while (nz < size) {
			if (arr[nz] != 0) {
				int temp = arr[nz];
				arr[nz] = arr[z];
				arr[z] = temp;
				nz++;
				z++;
			} else {
				nz++;
			}
		}
		return arr;
	}

}
