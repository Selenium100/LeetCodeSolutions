package Stack;

import java.util.Stack;

public class MinStackWithExtraSpace {
	
	Stack<Integer> s = new Stack<>();
	Stack<Integer> ss = new Stack<>();
	
	public MinStackWithExtraSpace() {
		
	}
	
	public void push(int ele) {
		s.push(ele);
		if(s.empty()) {
			ss.push(ele);
		}else {
			ss.push(Math.min(ele, ss.peek()));
		}
	}
	
	public void pop() {
		s.pop();
		ss.pop();
	}
	
	public int peek() {
		return s.peek();
	}
	
	public int minStack() {
		return ss.peek();
	}
	

	public static void main(String[] args) {
		

	}

}
