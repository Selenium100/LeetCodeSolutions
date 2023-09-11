package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] arr = {5,2,8,3};
		int target = 8;
		System.out.println(Arrays.toString(twosum(arr,target)));

	}

	private static int[] twosum(int[] arr, int target) {
		
		int size = arr.length;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i=0;i<size;i++) {
			int expNum = target-arr[i];
			if(hm.containsKey(expNum)) {
				return new int[] {hm.get(expNum),i};
			}else {
				hm.put(arr[i], i);
			}
		}
		return null;
	}

}
