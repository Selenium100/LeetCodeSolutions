package practice;

import java.util.ArrayList;

public class FirstNegetiveBruteForce {
	
	public static ArrayList<Integer> firstNegetive(int[] arr, int k){
		int size = arr.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<size-k+1;i++) {
			boolean found = false;
			for(int j = i;j<i+k;j++) {
				if(arr[j] < 0) {
					found = true;
					list.add(arr[j]);
					break;
				}
			}
			if(!found) {
				list.add(0);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		
		int [] arr = {-1,2,-4,5,6,7};
		int k = 3;
		ArrayList<Integer> list = firstNegetive(arr, k);
		System.out.println(list);

	}

}
