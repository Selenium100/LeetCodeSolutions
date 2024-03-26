package Stack;

import java.util.Stack;

/**
 * 
 * @author Nitya
 * 
 *Given a reverse polish Notation array like {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}
 *
 * Now create a stack.
 * Iterate the whole array and check if any arithimation operator is there?
 * If there then pop from stack and save it as 2nd operator.
 * Then pop it again and save it as 1st operator.
 * Then push its evaluate function return value to stack.
 * Else push the numbers to stack by converting string into integer.
 * At last we will get one number in stack, so return the number by stack.peek()
 */

public class EvaluateReversePolishNotation {
	
	public static int evaERVN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for(String eachToken: tokens) {
			if(eachToken.equals("+") || eachToken.equals("-") ||eachToken.equals("*") || eachToken.equals("/")) {
				int op2 = stack.pop();
				int op1 = stack.pop();
				stack.push(evaluate(op1,op2,eachToken));
				
			}else {
				stack.push(Integer.parseInt(eachToken));
			}
		}
		
		return stack.peek();
	}

	private static Integer evaluate(int op1, int op2, String eachToken) {
		
		if(eachToken.equals("+")) {
			return op1+op2;
		}else if(eachToken.equals("-")) {
			return op1-op2;
		}else if(eachToken.equals("*")) {
			return op1*op2;
		}else {
			return op1/op2;
		}
	}

	public static void main(String[] args) {
		
		String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		
		System.out.println(evaERVN(tokens));
	}

}
