package RoughPractice;

public class RainWaterTrapping {
	
	public static int rainWaterTrapping(int[] heights) {
		int n = heights.length;
		if(n == 0 || n == 1) {
			return 0;
		}
		
		//water[i] = Math.min(rightMax,leftMax)-heights[i];
		
		int[] leftMax = new int[n];
		leftMax[0] = heights[0];
		for(int i=1;i<n;i++) {
			leftMax[i] = Math.max(leftMax[i-1],heights[i]);
		}
		
		int[] rightMax = new int[n];
		rightMax[n-1] = heights[n-1];
		
		for(int i = n-2;i>=0;i--) {
			rightMax[i] = Math.max(rightMax[i+1], heights[i]);
		}
		
		int[] water = new int[n];
		int max = 0;
		for(int i=0;i<n;i++) {
			water[i] = Math.min(rightMax[i], leftMax[i]) - heights[i];
			max +=water[i];
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
		int max = rainWaterTrapping(heights);
		System.out.println(max);

	}

}
