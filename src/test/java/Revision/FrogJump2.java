package Revision;

public class FrogJump2 {
	
	public static void minJump(int[] dist, int k) {
		
		int n = dist.length;
		int frogCurrPos = 0;
		int minJump = 0;
		
		while(frogCurrPos<n) {
			int frogNextPos = frogCurrPos;
			int currDis = 0;
			
			while(frogNextPos+1<=n && currDis+dist[frogNextPos]<=k) {
				currDis += dist[frogNextPos];
				frogNextPos +=1;
			}
			
			if(frogCurrPos == frogNextPos) {
				System.out.println("Not Possible");
			}
			
			frogCurrPos = frogNextPos;
			minJump += 1;
			
		}
		
		System.out.println(minJump);
	}

	public static void main(String[] args) {
		
		int[] dist = {5,3,1,2,8};
		minJump(dist, 9);
		
		

	}

}
