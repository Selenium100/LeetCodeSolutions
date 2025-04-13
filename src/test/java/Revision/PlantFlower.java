package Revision;

public class PlantFlower {
	
	public static boolean plantFlower(int[] arr, int k) {
		
		int n = arr.length;
		int count = 0;
		
		for(int i=0;i<n;i++) {
			if(arr[i] == 0) {
				int prev = (i == 0)?0:arr[i-1];
				int next = (i == n-1)?0:arr[i+1];
				
				if(next == 0 && prev == 0) {
					arr[i] = 1;
					count++;
				}
			}
			
	
		}
		
		if(count>=k) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,0,0,0,1};
		System.out.println(plantFlower(arr, 2));

	}

}
