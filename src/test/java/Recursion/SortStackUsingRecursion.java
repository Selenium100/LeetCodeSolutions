package Recursion;

import java.util.Stack;

public class SortStackUsingRecursion {
	
	public static void sort(Stack<Integer> stack) {
		if(!stack.isEmpty()) {
			int top = stack.pop();
			sort(stack);
			insertTopElement(stack, top);
			
		}
	}

	private static void insertTopElement(Stack<Integer> stack, int ele) {
		if(stack.isEmpty() || ele>=stack.peek()) {
			stack.push(ele);
		}else {
			int top = stack.pop();
			insertTopElement(stack, ele);
			
			stack.push(top);
		}
		
	}

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(5);
		stack.push(2);
		stack.push(9);
		
		System.out.println("Original stack is "  + stack);
		
		sort(stack);
		
		System.out.println("Sorted stack is " + stack);
		

	}

}
