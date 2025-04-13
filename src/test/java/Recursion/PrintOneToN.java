package Recursion;

public class PrintOneToN {
	
	public static void print(int num) {
		if(num == 1) {
			System.out.println(1);
			return;
		}
		
		
		print(num-1);
		System.out.println(num);
		
		
	}

	public static void main(String[] args) {
		
		print(10);	

	}

}
