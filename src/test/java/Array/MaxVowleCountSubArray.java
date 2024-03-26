package Array;

public class MaxVowleCountSubArray {
	
	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
	
	public static int maxVowels(String s, int k) {
		
		int length = s.length();
        char[] charArray = s.toCharArray();
        int win_count =0;

        if(length<k){
            return -1;
        }

        for(int i=0;i<k;i++){
            if(isVowel(charArray[i])) {
            	win_count++;
            }
        }

        int max_count = win_count;

        for(int i=k;i<length;i++){
            if(isVowel(charArray[i])){
                win_count++;   
            }if(isVowel(charArray[i-k])){
                win_count--;
            }

            max_count = Math.max(win_count, max_count);
        }


        return max_count;
     
		
	}

	public static void main(String[] args) {
		

	}

}
