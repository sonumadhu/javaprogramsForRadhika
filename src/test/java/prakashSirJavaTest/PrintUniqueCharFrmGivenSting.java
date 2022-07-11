package prakashSirJavaTest;

import java.util.LinkedHashSet;

public class PrintUniqueCharFrmGivenSting {

	public static void main(String[] args) {
		
		                       // TODO Auto-generated method stub
		String s= "india";
		                          //1)create only set collection and all char of strings in to set
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
			
			
		}
		                     //2)compare each character of set with all the characters
		
		for(Character ch:set) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					count++;//3) After comparing if it is matching increment the count
				}
				
			}
			//4)print both character and count
			
			if(count==1) {
			System.out.println("character"+" "+ch);
		}
		
		}


	}

}
