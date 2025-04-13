package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElementToLeft {
	
	public static ArrayList<Integer> nextGreaterElementToLeft(int[] arr){
		int n = arr.length;
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			if(stack.empty()) {
				list.add(-1);
			}else if(!stack.empty() && stack.peek()>arr[i]) {
				list.add(stack.peek());
			}else if(!stack.empty() && stack.peek()<=arr[i]) {
				while(!stack.empty() && stack.peek()<=arr[i]) {
					stack.pop();
				}
				
				if(stack.empty()) {
					list.add(-1);
				}else {
					list.add(stack.peek());
				}
			}
			
			stack.push(arr[i]);
		}
		
		return list;
	}

	public static void main(String[] args) {
		
		int[] arr = {4,5,2,10,8}; // -1,-1,5,-1,10
		
		System.out.println(nextGreaterElementToLeft(arr));

	}

}
