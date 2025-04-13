package RoughPractice;

import java.util.Stack;

public class MinStackWithExtraSpace {
	
	Stack<Integer> s = new Stack<>();
	Stack<Integer> ss = new Stack<>();
	
	public MinStackWithExtraSpace() {
		
	}
	
	public void push(int ele) {
		s.push(ele);
		if(ss.empty()) {
			ss.push(ele);
		}else {
			ss.push(Math.min(ss.peek(), ele));
		}
	}
	
	public void pop() {
		s.pop();
		ss.pop();
	}
	
	public int peek() {
		return s.peek();
	}
	
	public int getMin() {
		return ss.peek();
	}

	public static void main(String[] args) {
		
		MinStackWithExtraSpace minStack = new MinStackWithExtraSpace();
		minStack.push(5);
		minStack.push(2);
		minStack.push(4);
		minStack.push(1);
		
		minStack.pop();
		
		System.out.println(minStack.getMin());
		

	}

}
