package Array;

import java.util.Arrays;

/**
 * 
 * @author Nitya
 * 
 * Link - https://leetcode.com/problems/next-permutation/description/
 * 
 * Intuition:
 * 1. start with i = length-1;
 * 2. Check untill i>=0 and arr[i]<arr[i+1] then decrease i
 * 3. So now we are getting the breaking point.
 * 4. Now find the next just greater or equal to element of i. So j = arr.length-1;
 * 5. Check untill arr[j]<= arr[i] then do j--;
 * 6. once i and j id found then swap it.
 * 7. if i is not >=0 then we have to reverse the entire array.
 *
 */

public class NextPermutation {
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void reverse(int[] arr, int start) {
		int i = start, j = arr.length-1;
		
		while(i<j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	
		
	}
	
	public static void nextpermutation(int[] arr) {
		int i = arr.length-2;
		
		//Find the breaking point
		while(i>=0 && arr[i+1]<=arr[i]) {
			i--;
		}
		
		//find the just next greater element of i.
		if(i>=0) {
			int j = arr.length-1;
			
			while(arr[j]<=arr[i]) {
				j--;
			}
			
			swap(arr, i, j);
		}
		
		reverse(arr, i+1);
		
	}

	public static void main(String[] args) {
		
		int[] arr = {1,1,5};
		nextpermutation(arr);
		System.out.println(Arrays.toString(arr));

	}

}
