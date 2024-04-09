package Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSortWithRandomPivot {
	
	public static int generateRandomNumber(int l , int r) {
		return l+(int) (Math.random() * (r-l+1));
	}
	
	public static int partition(int[] arr, int l, int r) {
		int randomPivot = generateRandomNumber(l, r);
		int temp = arr[randomPivot];
		arr[randomPivot] = arr[r];
		arr[r] = temp;
		
		int pivotEle = arr[r];
		
		ArrayList<Integer> smallerList = new ArrayList<>();
		ArrayList<Integer> biggerList = new ArrayList<>();
		
		for(int i=l;i<r;i++) {
			if(arr[i]<=pivotEle) {
				smallerList.add(arr[i]);
			}else{
				biggerList.add(arr[i]);
			}
		}
		
		int id = l;
		for(int i=0;i<smallerList.size();i++) {
			arr[id] = smallerList.get(i);
			id++;
		}
		
		arr[id] = pivotEle;
		int pivortIndex = id;
		id++;
		
		for(int i=0;i<biggerList.size();i++) {
			arr[id] = biggerList.get(i);
			id++;
		}
		
		return pivortIndex;
		
	}
	
	public static void quickSort(int[] arr, int l, int r) {
		
		if(l>=r) {
			return;
		}
		
		int id = partition(arr, l, r);
		
		quickSort(arr,l,id-1);
		quickSort(arr, id+1, r);
	}
	
	public static int[] sortArray(int[] arr) {
		quickSort(arr, 0, arr.length-1);
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = {5,1,7,3,9,4,6};
		sortArray(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
