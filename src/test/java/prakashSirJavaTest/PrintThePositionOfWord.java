package prakashSirJavaTest;

import java.util.LinkedHashSet;

public class PrintThePositionOfWord {

	public static void main(String[] args) {
		// here position means index===>print the position of word means print the index of the word
		

		String s="welcom to india ";
		String[] str=s.split(" ");

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		//1)
		for( int i=0;i<str.length;i++)
		{
			lhs.add(str[i]);
		}

		for (String word : lhs) {

			for(int i=0;i<s.length();i++) {
				if(word.equals(str[i])) {

					System.out.println(word+"==>"+(i+1));// count starts from 1 
					
					                      /*it is similar to avoid duplicates from given string program but only the difference is (i+1) 
					                                                           */
					
					break;               //we don't want to print same char multiple time then use break

				}

			}

		}


	}

}
