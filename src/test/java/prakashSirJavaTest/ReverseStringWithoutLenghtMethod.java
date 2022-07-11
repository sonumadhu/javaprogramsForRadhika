package prakashSirJavaTest;

public class ReverseStringWithoutLenghtMethod {

	public static void main(String[] args) {
		//reverse a string without using rev,length(),for loop
		String s="india";
		
		 char ch[] = s.toCharArray();
		 String rev="";
		 for(char c:ch) {     //for each loop
			 rev=c+rev;
			 
		 }
		 System.out.println(rev);

	}

}
