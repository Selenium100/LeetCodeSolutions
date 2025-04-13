package Stack;

public class RainWaterTrapping {
	
	public static int trapWater(int[] height) {
		int n = height.length;
		if(n == 0 || n == 1) {
			return 0;
		}
		
		int[] leftMax = new int[n];
		int[] rightMax = new int[n];
		
		leftMax[0] = height[0];
		
		for(int i=1;i<n;i++) {
			leftMax[i] = Math.max(leftMax[i-1], height[i]);
		}
		
		rightMax[n-1] = height[n-1];
		
		for(int i=n-2;i>=0;i--) {
			rightMax[i] = Math.max(rightMax[i+1], height[i]);
		}
		
		int[] water = new int[n];
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			water[i] = Math.min(leftMax[i], rightMax[i])-height[i];
			sum +=water[i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		

	}

}
