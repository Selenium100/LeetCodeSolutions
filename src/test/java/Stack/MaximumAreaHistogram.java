package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Stack;

public class MaximumAreaHistogram {
	
	public static ArrayList<Integer> nearestSmallLeftIndexList(int[] arr){
		int n = arr.length;
		Stack<Map.Entry<Integer,Integer>> stack = new Stack<>();
		ArrayList<Integer> leftList = new ArrayList<Integer>();
		int psedoIndex = -1;
		
		for(int i=0;i<n;i++) {
			if(stack.empty()) {
				leftList.add(psedoIndex);
			}else if(!stack.empty() && stack.peek().getKey()<arr[i]) {
				leftList.add(stack.peek().getValue());
			}else if(!stack.empty() && stack.peek().getKey()>=arr[i]) {
				while(!stack.empty() && stack.peek().getKey()>=arr[i]) {
					stack.pop();
				}
				
				if(stack.empty()) {
					leftList.add(psedoIndex);
				}else {
					leftList.add(stack.peek().getValue());
				}
			}
			
			stack.push(Map.entry(arr[i], i));
		}
		
		return leftList;
	}
	
	public static ArrayList<Integer> nearestSmallerRightIndexList(int[] arr){
		int n = arr.length;
		Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();
		ArrayList<Integer> rightList = new ArrayList<Integer>();
		int psedoIndex = n;
		
		for(int i=n-1;i>=0;i--) {
			if(stack.empty()) {
				rightList.add(psedoIndex);
			}else if(!stack.empty() && stack.peek().getKey()<arr[i]) {
				rightList.add(stack.peek().getValue());
			}else if(!stack.empty() && stack.peek().getKey()>=arr[i]) {
				while(!stack.empty() && stack.peek().getKey()>=arr[i]) {
					stack.pop();
				}
				
				if(stack.empty()) {
					rightList.add(psedoIndex);
				}else {
					rightList.add(stack.peek().getValue());
				}
			}
			
			stack.push(Map.entry(arr[i], i));
		}
		Collections.reverse(rightList);
		return rightList;
	}
	
	public static int maxAreaHistogram(int[] arr) {
		int n = arr.length;
		int[] width = new int[n];
		int[] area = new int[n];
		int max = 0;
		ArrayList<Integer> nsr_index_list = nearestSmallerRightIndexList(arr);
		ArrayList<Integer> nsl_index_list = nearestSmallLeftIndexList(arr);
		
		System.out.println("NSR: " + nsr_index_list);
		System.out.println("NSL: " + nsl_index_list);
		
		for(int i=0;i<n;i++) {
			width[i] = nsr_index_list.get(i) - nsl_index_list.get(i) -1;
			area[i] = width[i] * arr[i];
			max = Math.max(max, area[i]);
		}
		
		System.out.println("width " + Arrays.toString(width));
		System.out.println("area " + Arrays.toString(area));
		
		return max;
	}

	public static void main(String[] args) {
		int [] arr = {2,1,5,6,2,3};
		int max = maxAreaHistogram(arr);
		System.out.println("Maximum Area of Histogram: "+ max);

	}

}
