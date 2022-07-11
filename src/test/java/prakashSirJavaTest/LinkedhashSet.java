package prakashSirJavaTest;

import java.util.LinkedHashSet;

public class LinkedhashSet {

	public static void main(String[] args) {
		
		String s= "india";
		//1
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
			
			
		}
		//2
		for(Character ch:set) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					count++;//4
				}
				
			}
			//4
			System.out.println("character"+ch+""+"count"+""+count);
		}
		

	}

}
