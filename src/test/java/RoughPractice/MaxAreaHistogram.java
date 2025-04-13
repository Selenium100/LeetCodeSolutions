package RoughPractice;

import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;

public class MaxAreaHistogram {
	public static ArrayList<Integer> nsl_index_list(int[] arr){
		int n = arr.length;
		ArrayList<Integer> leftList = new ArrayList<>();
		Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();
		int psudo_index = -1;
		
		for(int i=0;i<n;i++) {
			if(stack.empty()) {
				leftList.add(psudo_index);
			}else {
				if(!stack.empty() && stack.peek().getKey()<arr[i]) {
					leftList.add(stack.peek().getValue());
				}else if(!stack.empty() && stack.peek().getKey()>=arr[i]) {
					while(!stack.empty() && stack.peek().getKey()>=arr[i]) {
						stack.pop();
					}
					
					if(stack.empty()) {
						leftList.add(psudo_index);
					}else {
						leftList.add(stack.peek().getValue());
					}
				}
			}
			
			stack.push(Map.entry(arr[i], i));
		}
		
		return leftList;
	}
   public static void main(String[] args) {
	
}
}
