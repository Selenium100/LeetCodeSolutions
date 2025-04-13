package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElementToRightNewApproach {
	
	public static ArrayList<Integer> nextGreaterElement(int[] arr) {
		int n = arr.length;
		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=n-1;i>=0;i--) {
			if(stack.empty()) {
				list.add(-1);
			}else if(stack.size()>0 && stack.peek()>arr[i]) {
				list.add(stack.peek());
			}else if(stack.size()>0 && stack.peek()<=arr[i]) {
				while(stack.size()>0 && stack.peek()<=arr[i]) {
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
		
		Collections.reverse(list);
		return list;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,3,2,4};
		System.out.println(nextGreaterElement(arr));

	}

}
