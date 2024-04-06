package String;

public class GoodString {
	
	public static String makeGoodString(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		for(char ch: str.toCharArray()) {
			if(sb.length()>0 && isOpposite(sb.charAt(sb.length()-1), ch)) {
				sb.deleteCharAt(sb.length()-1);
			}else {
				sb.append(ch);
			}
			
		}
		
		return sb.toString();
	}

	private static boolean isOpposite(char a, char b) {
		return Math.abs(a-b) == 32;
	}

	public static void main(String[] args) {
		
		String str = "leEeetcode";
		String goodString =  makeGoodString(str);
		System.out.println(goodString);

	}

}
