package Greedy;

public class FrogJump {
	
	public static void minJump(int[] dist, int k) {
		int n = dist.length;
		int curId = 0;
		int minJump = 0;
		
		while(curId<n) {
			int nextId = curId;
			int curDist = 0;
			
			while(nextId+1<=n && curDist + dist[nextId]<=k) {
				curDist +=dist[nextId];
				nextId += 1;
			}
			
			if(curId == nextId) {
				return;
			}
			
			curId = nextId;
			minJump += 1;
		}
		
		System.out.println(minJump);
	}

	public static void main(String[] args) {
		
		int[] dist = {5,3,1,2,8};
		minJump(dist, 9);

	}

}
