package prakashSirJavaTest;

import java.util.LinkedHashSet;

public class PrintThePositionOfCharacter {

	public static void main(String[] args) {
		// print the position of the character from the given string
		
		String s="indian";
		
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		//1)
		for( int i=0;i<s.length();i++)
		{
			lhs.add(s.charAt(i));
		}
		
		for (Character ch : lhs) {
			
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					
					System.out.println(ch+"==>"+(i+1));// count starts from 1
					break;//we dont want to print same char multiple time then use break
					
				}
				
			}
			
		}

	}

}
