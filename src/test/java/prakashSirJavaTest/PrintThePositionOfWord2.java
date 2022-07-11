package prakashSirJavaTest;

import java.util.LinkedHashSet;

public class PrintThePositionOfWord2 {

	public static void main(String[] args) {
		// how many times the word is repeating 
		
		
		String s="katham Ta ta Bye bye ";
		String[] str=s.split(" ");

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		//1)
		for( int i=0;i<str.length;i++)
		{
			lhs.add(str[i]);
		}

		for (String word : lhs) {
			int count=0;
			for(int i=0;i<str.length;i++) {
				if(word.equalsIgnoreCase(str[i])) {

					count++;

				}

			}
			System.out.println(word+" "+count);
		}
		//System.out.println(word+""+count);

	}
}

