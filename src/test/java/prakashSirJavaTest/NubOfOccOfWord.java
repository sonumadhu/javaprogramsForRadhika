package prakashSirJavaTest;

import java.util.LinkedHashSet;

public class NubOfOccOfWord {

	public static void main(String[] args) {
		String s= "welcome to india";
		String[] str=s.split(" ");
		
		//1)create only set collection and all char of strings in to set
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
			
			
		}
		//2)compare each character of set with all the characters
		
		for(String word:set) {
			int count=0;
			for(int i=0;i<str.length;i++) {
				if(word.equals(str[i])) {
					count++;         //3) After comparing if it is matching increment the count
				}
				
			}
			//4)print both character and count
			
			
			System.out.println("word==>"+" "+word+"        "+"count ="+" "+count);
		
		
		}


	}

}
