package RoughPractice;

import java.util.ArrayList;
import java.util.List;

public class FirstNegetiveNumberSubarray {
	public static List<Integer> firstNegetiveElement(int[] arr, int k){
		int size = arr.length;
		ArrayList<Integer> negetive_bucket_list = new ArrayList<>();
		ArrayList<Integer> res = new ArrayList<>();
		
		for(int i=0;i<=size-k;i++) {
			
			for(int j =i;j<i+k;j++) {
				if(arr[j]<0) {
					negetive_bucket_list.add(arr[j]);
				}
				
			
			}
			
			
			if(negetive_bucket_list.isEmpty()) {
				res.add(0);
			}else {
				res.add(negetive_bucket_list.get(0));
			}
			
			negetive_bucket_list.clear();
		}
		return res;
	}

	public static void main(String[] args) {
		
		int[] arr = {5,3,-1,-2,16,2,-3,7};
		List<Integer> list = firstNegetiveElement(arr, 3);
		System.out.println(list);

	}

}
