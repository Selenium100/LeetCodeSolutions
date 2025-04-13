package Revision;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
	
	public static int partition(int[] arr, int l, int r) {
		int pivotElement = arr[r];
		ArrayList<Integer> smallerList = new ArrayList<>();
		ArrayList<Integer> biggerList = new ArrayList<>();
		
		for(int i=l;i<r;i++) {
			if(arr[i]<=pivotElement) {
				smallerList.add(arr[i]);
			}else {
				biggerList.add(arr[i]);
			}
		}
		
		int id = l;
		for(int i=0;i<smallerList.size();i++) {
			arr[id] = smallerList.get(i);
			id++;
		}
		
		arr[id] = pivotElement;
		int pivotIndex = id;
		id++;
		
		for(int i=0;i<biggerList.size();i++) {
			arr[id] = biggerList.get(i);
			id++;
		}
		
		return pivotIndex;
		
	}
	
	public static void quickSort(int[] arr, int l, int r) {
		if(l>=r) {
			return;
		}
		
		int id = partition(arr, l, r);
		
		quickSort(arr, l, id-1);
		quickSort(arr, id+1, r);
		
	}
	
	public static int[] sortedArray(int[] arr, int l, int r) {
		quickSort(arr, l, r);
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = {9,1,8,2,7,3,6,4,5};
		int[] sortedArr = sortedArray(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(sortedArr));

	}

}
