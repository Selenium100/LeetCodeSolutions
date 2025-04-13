package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

public class StockSpanProblemNGLapproach {
	
	public static int[] stockSpan(int[] prices) {
		int n = prices.length;
		Stack<Map.Entry<Integer,Integer>> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		int[] ans = new int[n];
		
		for(int i=0;i<n;i++) {
			if(stack.empty()) {
				list.add(-1);
			}else if(!stack.empty() && stack.peek().getKey()>prices[i]) {
				list.add(stack.peek().getValue());
			}else if(!stack.empty() && stack.peek().getKey()<=prices[i]) {
				while(!stack.empty() && stack.peek().getKey()<=prices[i]) {
					stack.pop();
				}
				
				if(stack.empty()) {
					list.add(-1);
				}else {
					list.add(stack.peek().getValue());
				}
			}
			
			stack.push(Map.entry(prices[i],i));
		}
		
		for(int i=0;i<n;i++) {
			ans[i] = i - list.get(i);
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		int[] prices = {100, 80, 60, 70, 60, 75, 85};
		int[] ans = stockSpan(prices);
		System.out.println(Arrays.toString(ans));

	}

}
