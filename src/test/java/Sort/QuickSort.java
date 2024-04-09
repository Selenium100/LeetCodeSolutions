package Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
	
	public static int partition(int[] arr, int l,int r) {
		int pivotEle = arr[r];
		ArrayList<Integer> smaller = new ArrayList<>();
		ArrayList<Integer> bigger = new ArrayList<>();
		
		for(int i =l; i<r;i++) {
			if(arr[i]<=pivotEle) {
				smaller.add(arr[i]);
			}else {
				bigger.add(arr[i]);
			}
		}
		
		int id = l;
		for(int i=0;i<smaller.size();i++) {
			arr[id] = smaller.get(i);
			id++;
		}
		
		arr[id] = pivotEle;
		int pivortIndex = id;
		id++;
		
		for(int i=0;i<bigger.size();i++) {
			arr[id] = bigger.get(i);
			id++;
		}
		
		return pivortIndex;
	}
	
	public static void quickSort(int[] arr, int l,int r) {
		if(l>=r) {
			return;
		}
		
		int id = partition(arr, l, r);
		quickSort(arr, l, id-1);
		quickSort(arr, id+1, r);
		
		
	}

	public static void main(String[] args) {
		
		int[] arr = {5,1,7,3,9,4,6};
		quickSort(arr, 0, 6);
		System.out.println(Arrays.toString(arr));

	}

}
