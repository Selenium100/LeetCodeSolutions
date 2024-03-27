package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * 
 * @author Nitya
 * 
 * Given a Array of even and odd numbers
 * Find out max frequency of even number
 * If max number is same then return the smaller element.
 * 
 * [0,1,2,2,4,4,1] - Here max even frequency numbers are 2 and 4
 * So return the smaller number 2
 *
 */

public class MaxEvenFreqElement {
	
	public static int maxEven(int[] nums) {
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(Integer num : nums) {
			if(hm.get(num) == null) {
				hm.put(num,1);
			}else {
				hm.put(num, hm.get(num)+1);
			}
		}
		
		int maxFreqSoFar = 0;
		int finalAns = 0;
		
		for(Entry<Integer, Integer> keyValue: hm.entrySet()) {
			int currFreq = keyValue.getValue(); 
			
			if(keyValue.getKey()%2 !=0 || currFreq<maxFreqSoFar) {
				continue;
			}
			
			if(currFreq>maxFreqSoFar || keyValue.getKey()<finalAns) {
				maxFreqSoFar = currFreq; 
				finalAns = keyValue.getKey(); 
			}
		}
		
		return finalAns;
		
	}

	public static void main(String[] args) {
		int [] nums = {0,1,2,2,4,4,1};
		System.out.println(maxEven(nums));

	}

}
