package String;

import java.util.HashMap;

public class Isomorphic {
	
	public static boolean isIsomorphic(String s, String t) {
		HashMap<Character,Character> hm = new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			char original = s.charAt(i);
			char replacement = t.charAt(i);
			
			if(!hm.containsKey(original)) {
				if(!hm.containsValue(replacement)) {
					hm.put(original, replacement);
				}else {
					return false;
				}
			}else {
				char mappedChar = hm.get(original);
				if(mappedChar != replacement) {
					return false;
				}
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println(isIsomorphic("paper", "title"));

	}

}
