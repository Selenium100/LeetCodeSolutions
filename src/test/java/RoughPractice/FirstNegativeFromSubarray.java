package RoughPractice;

import java.util.ArrayList;

public class FirstNegativeFromSubarray {
	
	public static ArrayList<Integer> firstNegativeFromSubArray(int[] arr, int k) {
		int size = arr.length;
		int start = 0;
		int end = 0;
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> res = new ArrayList<>();
		
		while(end<size) {
			if(arr[end]<0) {
				list.add(arr[end]);
			}
		if(end-start+1<k) {
			end++;
		}else if(end-start+1==k) {
			if(list.isEmpty()) {
				res.add(0);
			}else {
				res.add(list.get(0));
				if(arr[start] == list.get(0)) {
					list.remove(0);
				}
				start++;
				end++;
			}
		}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = {2,-1,5,-2,7,-3,9};
		
		System.out.println(firstNegativeFromSubArray(arr, 3));

	}

}
