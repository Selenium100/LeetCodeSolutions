package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSumPractice {
	
	
	public static int[] twoSum(int[] arr, int target){
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			
			if(hm.containsKey(target - arr[i])) {
				int[] res = {i, hm.get(target - arr[i])};
				return res;
			}
			hm.put(arr[i],i);
			
		}
		return new int[0];
		
	}

	public static void main(String[] args) {
		
		int[] arr = {3,2,4};
		int target = 7;
		
		
		System.out.println(Arrays.toString(twoSum(arr, target)));

	}

}
