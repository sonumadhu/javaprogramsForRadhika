package prakashSirJavaTest;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordFromGivenString {

	public static void main(String[] args) {
		String s= "welcome to to india india";
		String[] str=s.split(" ");
		
		
		//1
		LinkedHashSet<String> set = new LinkedHashSet<String>(); /*set will not allow duplicate*/
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);


		}
		for(String word:set) { 
			System.out.print(word+" ");


		}


	}

}
