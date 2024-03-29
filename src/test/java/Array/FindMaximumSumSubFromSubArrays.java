package Array;

public class FindMaximumSumSubFromSubArrays {
	
	public static int findMaxSum(int[] arr, int k) {
		int length = arr.length;
		int max_sum = 0;
		
		if(length<k) {
			System.out.println("Invalid");
			return -1;
		}
		
		for(int i=0;i<k;i++) {
			max_sum +=arr[i];
		}
		
		int win_sum = max_sum;
		
		for(int i=k;i<length;i++) {
			win_sum += arr[i] - arr[i-k];
			max_sum = Math.max(max_sum, win_sum);
		}
		return max_sum;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,4,2,10,2,3,1,0,20};
		int k = 4;
		
		System.out.println(findMaxSum(arr, k));
	}

}
