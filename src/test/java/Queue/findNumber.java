package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 
 * @author Nitya
 * 
 * Given an int number n. Find the nth number which can be done from 2,3,5
 *
 */

public class findNumber {
	
	public static int findNum(int n) {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(2);
		queue.add(3);
		queue.add(5);
		
		for(int i=0;i<n-1;i++) {
			int x = queue.peek();
			queue.poll();
			
			queue.add(10*x+2);
			queue.add(10*x+3);
			queue.add(10*x+5);
		}
		
		return queue.poll();
	}

	public static void main(String[] args) {
		
		
		System.out.println(findNum(5));

	}

}
