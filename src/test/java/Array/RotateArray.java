package Array;

import java.util.ArrayList;

public class RotateArray {
	
	public static void rotate(int[] nums, int k ){
		int length = nums.length;
        k = k % length;

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=length-k;i<length;i++){
            list.add(nums[i]); //6,7
        }

        for(int i = length-k-1; i>=0; i--){
            nums[i+k] = nums[i];
        }

            for(int i=0;i<k;i++){
                nums[i]=list.get(i);
            }
    }

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		int k=2;
		

	}

}
