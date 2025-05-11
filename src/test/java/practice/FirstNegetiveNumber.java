package practice;

import java.util.ArrayList;

public class FirstNegetiveNumber {
	
    public static ArrayList<Integer> firstNegative(int[] arr, int windowSize) {
        if (arr == null || arr.length == 0) {
            return new ArrayList<>();
        }
        if (windowSize <= 0 || windowSize > arr.length) {
            throw new IllegalArgumentException("Window size must be between 1 and array length");
        }
        int size = arr.length;
        int windowStart = 0;
        int windowEnd = 0;
        ArrayList<Integer> tempList = new ArrayList<>();
        ArrayList<Integer> resList = new ArrayList<>();
        
        while (windowEnd < size) {
            if (arr[windowEnd] < 0) {
                tempList.add(arr[windowEnd]);
            }
            
            if (windowEnd - windowStart + 1 < windowSize) {
                windowEnd++;
            } else if (windowEnd - windowStart + 1 == windowSize) {
                if (tempList.isEmpty()) {
                    resList.add(0);
                } else {
                    resList.add(tempList.get(0));
                    if (arr[windowStart] == tempList.get(0)) {
                        tempList.remove(0);
                    }
                }
                windowStart++;
                windowEnd++;
            }
        }
        return resList;
    }

	public static void main(String[] args) {
		int [] arr = {-1,2,-4,5,6,7};
		int k = 3;
		ArrayList<Integer> list = firstNegetive(arr, k);
		System.out.println(list);

	}

}
