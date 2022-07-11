package prakashSirJavaTest;

import java.util.LinkedHashSet;

public class PrintUniqueWordFromgivenString {

	public static void main(String[] args) {
	
		                          // Unique word means its prints the word which is not repeated/duplicate
		
		String s= "welcome to to india india ";
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
					count++;            //3) After comparing if it is matching increment the count
				}
				
			}
			                             //4)print both character and count
			
			if(count==1) {
			System.out.println("unique word =====>"+" "+word);
		}
		
		}

	}

}
