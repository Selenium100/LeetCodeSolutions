package Stack;

import java.util.Stack;

/**
 * 
 * @author Nitya
 * 
 * link - https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
 * 
 * Concept - Monotonic Stack
 * 
 * Time - O(n)
 * Space - O(n)
 * 
 * arr[] = [1 3 2 4]
 * ans [] = [3,4,4,-1]
 * 
 * Solution
 * 
 * 1. Create a Stack
 * 2. Create a ans [] with same length as arr
 * 3. Iterate the arr from last to first
 * 4. put a condition while stack not equal to empty and stack.peek<=arr[i] then stack.pop()
 * 5. else ans[i] = stack.empty()? -1 : stack.peek();
 * 6. Then push the arr[i[ to stack
 * 7. return ans array
 *
 */

public class NextGreaterElement {
	
	public static long[] nextGreaterElementArr(long[] arr, int n) {
		
		Stack<Long> stack = new Stack<Long>();
		long[] ans = new long[n];
		
		for(int i=n-1;i>=0;i--) {
			while(!stack.empty() && stack.peek()<=arr[i]) {
				stack.pop();
			}
			
			ans[i] = stack.empty()?-1:stack.peek();
			stack.push(arr[i]);
			
		}
		return ans;
		
		
	}

	public static void main(String[] args) {
		

	}

}
