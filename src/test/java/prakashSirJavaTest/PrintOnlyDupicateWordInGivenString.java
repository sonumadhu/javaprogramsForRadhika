package prakashSirJavaTest;

import java.util.LinkedHashSet;

public class PrintOnlyDupicateWordInGivenString {

	public static void main(String[] args) {
		// print only duplicate words from given statement
		
		String s="welcome to india india";
		String[] str = s.split(s);//string[]==> string array means it consist of strings i each block
		
		//1)
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<=str.length;i++)
		{
		
		set.add(str[i])	;
			
		}
		//2)
		
		for (String word : set) {
			int count=0;
			//for(int i)
			{
				
			}
			
		}
		
		
		
		

	}

}
