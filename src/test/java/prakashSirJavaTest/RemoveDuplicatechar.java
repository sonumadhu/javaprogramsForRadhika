package prakashSirJavaTest;

import java.util.LinkedHashSet;

public class RemoveDuplicatechar {

	public static void main(String[] args) {
		String s= "india";
		//in the case of character we make use of charAt() method
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));


		}
		for(Character ch:set) { 
			System.out.print(ch);


		}

	}
}




