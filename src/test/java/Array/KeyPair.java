package Array;

import java.util.HashMap;

/**
 * 
 * @author Nitya
 * 
 * Link - https://www.geeksforgeeks.org/problems/key-pair5616/1
 * 
 * Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.
 *
 */

public class KeyPair {
	
	public static boolean hasArrayTwoCandidates(int[] arr, int x) {
		int length = arr.length;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i=0;i<length;i++) {
			int curr_ele = arr[i];
			int exp_ele = x-curr_ele;
			if(hm.containsKey(exp_ele)) {
				return true;
			}
			
			if(hm.get(arr[i])==null) {
				hm.put(arr[i],1);
			}else {
				hm.put(arr[i],hm.get(arr[i]+1));
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,4,45,6,10,8};
		System.out.println(hasArrayTwoCandidates(arr, 55));

	}

}
