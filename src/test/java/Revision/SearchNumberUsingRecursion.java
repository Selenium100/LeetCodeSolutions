package Revision;

public class SearchNumberUsingRecursion {
	
	public static boolean helper(int[] arr, int k, int start, int end) {
		
		if(start > end) {
            return false;
        }
        
        int mid = (start + end) / 2;
        
        if(arr[mid] == k) {
            return true;
        } else if(arr[mid] < k) {
            return helper(arr, k, mid + 1, end);
        } else {
            return helper(arr, k, start, mid - 1);
        }
		
	}
	
	public static boolean search(int n,int[] arr, int k) {
		boolean ans = helper(arr, k, 0, arr.length-1);
		return ans;
	}

	public static void main(String[] args) {
		
		int[] arr =  {1,2,3,4,5,6};
		int k = 10;
		
		boolean num = search(arr.length, arr, k);
		System.out.println(num);

	}

}
