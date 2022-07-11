package prakashSirJavaTest;

public class PrintVowel {

	public static void main(String[] args) {
		// print only vowel
		
		String s="bhushana";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u' ) {
				System.out.println(ch);
				
			}
		}

	}

}
