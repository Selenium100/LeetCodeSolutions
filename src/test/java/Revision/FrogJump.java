package Revision;

public class FrogJump {
	
	public static void minJump(int[] dist, int k) {
		int n = dist.length;
		int currId = 0;
		int minJump = 0;
		
		while(currId<n) {
			int nextId = currId;
			int currDis = 0;
			
			while(nextId+1<=n && currDis+dist[nextId]<=k) {
				currDis += dist[nextId];
				nextId +=1;
			}
			
			if(currId == nextId) {
				System.out.println("Not Possible");
			}
			
			currId = nextId;
			minJump += 1;
			
		}
		
		System.out.println(minJump);
	}

	public static void main(String[] args) {
		
		int[] dist = {5,3,1,2,8};
		minJump(dist, 9);
		
		

	}

}
