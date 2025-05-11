package practice;

import java.util.ArrayList;

public class FirstNegetiveNumber {
	
	public static ArrayList<Integer> firstNegetive(int[] arr, int k){
		int size = arr.length;
		int start = 0;
		int end = 0;
		ArrayList<Integer> tempList = new ArrayList<>();
		ArrayList<Integer> resList = new ArrayList<>();
		
		
		while(end<size) {
			if(arr[end]<0) {
				tempList.add(arr[end]);
			}
			
			if(end-start+1 < k) {
				end++;
			}else if(end-start+1 == k) {
				if(tempList.isEmpty()) {
					resList.add(0);
				}else {
					resList.add(tempList.get(0));
					if(arr[start] == tempList.get(0)) {
						tempList.remove(0);
					}
					
				}
				start++;
				end++;
			}
		}
		return resList;
	}

	public static void main(String[] args) {
		int [] arr = {-1,2,-4,5,6,7};
		int k = 3;
		ArrayList<Integer> list = firstNegetive(arr, k);
		System.out.println(list);

	}

}
