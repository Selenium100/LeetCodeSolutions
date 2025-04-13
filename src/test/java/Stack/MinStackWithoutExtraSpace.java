package Stack;

import java.util.Stack;

public class MinStackWithoutExtraSpace {
	
	Stack<Integer> stack = new Stack<>();
	int minEle = 0;
	
	public MinStackWithoutExtraSpace() {
		
	}
	
	public void push(int ele) {
		if(stack.empty()) {
			stack.push(ele);
			minEle = ele;
		}else {
			if(ele>=minEle) {
				stack.push(ele);
			}else if(ele<minEle) {
				stack.push(2*ele-minEle);
				minEle = ele;
			}
		}
	}
	
	public void pop() {
		if(stack.empty()) {
			return;
		}else {
			if(stack.peek()>=minEle) {
				stack.pop();
			}else if(stack.peek()<minEle) {
				minEle = 2*minEle-stack.peek();
				stack.pop();
			}
		}
		
	}
	
	public int peek() {
		if(stack.empty()) {
			return -1;
		}else {
			if(stack.peek()>=minEle) {
				return stack.peek();
			}else if(stack.peek()<minEle) {
				return minEle;
			}
		}
		return minEle;
	}
	
	public int minStack() {
		if(stack.empty()) {
			return -1;
		}
		
		return minEle;
	}
	
	

	public static void main(String[] args) {
		
		MinStackWithoutExtraSpace min = new MinStackWithoutExtraSpace();
		min.push(5);
		min.push(3);
		min.push(7);
		min.push(2);
		
		min.pop();
		min.pop();
		System.out.println(min.peek());

	}

}
