package RoughPractice;

import java.util.ArrayList;

public class FirstNegativeNumberInEveryWinSize {
	
	public static ArrayList<Integer> firstNegativeNumber(int[] arr, int k) {
		int size = arr.length;
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<=size-k;i++) {
			for(int j=i;j<i+k;j++) {
				if(arr[j]<0) {
					list.add(arr[j]);
					break;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		
		int[] arr = {-1,2,4,-7,8,3,-2};
		ArrayList<Integer> list = firstNegativeNumber(arr, 3);
		System.out.println(list);

	}

}
