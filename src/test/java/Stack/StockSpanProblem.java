package Stack;

import java.util.Stack;

public class StockSpanProblem {
	
	public static int[] calculateSpan(int[] price,int n) {
		Stack<Integer> stack = new Stack<Integer>();
		int[] ans = new int[n];
		
		for(int i=0;i<n;i++) {
			while(!stack.empty() && price[stack.peek()]<=price[i]) {
				stack.pop();
			}
			
			ans[i] = stack.empty()?i+1:i-stack.peek();
			stack.push(i);
		}
		return ans;
	}

	public static void main(String[] args) {
		
		

	}

}
