package RoughPractice;

import java.util.Arrays;

public class CanPlaceFlowers {
	
	public static boolean canPlaceFlower(int[] flowerbed, int k) {
		int n = flowerbed.length;
		int start = 0;
		
		for(int i=0;i<n;i++) {
			if(flowerbed[start]==1 && start == 0) {
				flowerbed[start+1] = -1;
			}else if(flowerbed[start]==1 && start == n-1) {
				flowerbed[start-1] = -1;
			}else if(flowerbed[start]==1) {
				flowerbed[start+1] = -1;
				flowerbed[start-1] = -1;
			}
			
			start++;
		}
		
		int count = 0;
		for(int i=0;i<n;i++) {
			if(flowerbed[i] == 0) {
				count++;
			}
		}
		
		if(count>= k) {
			return true;
		}
		
		return false;
		
		
	}

	public static void main(String[] args) {
		
		int[] flowerbed = {1,0,0,0,1};
		boolean sorted = canPlaceFlower(flowerbed,1);
		System.out.println(sorted);

	}

}
