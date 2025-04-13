package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumPractice2 {
	
	public static int[] twoSum(int[] arr, int target) {
		int length = arr.length;
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<length;i++) {
			if(hm.containsKey(target-arr[i])) {
				 int[] res = {hm.get(target-arr[i]),i};
				 return res;
			}
			
			hm.put(arr[i],i);
		}
		
		return new int[0];
	}

	public static void main(String[] args) {
		
		int[] arr = {2,7,11,15};
		int target = 9;
		
		System.out.println(Arrays.toString(twoSum(arr, target)));
		

	}

}
