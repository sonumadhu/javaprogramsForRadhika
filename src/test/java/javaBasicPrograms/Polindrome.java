package javaBasicPrograms;

public class Polindrome {

	public static void main(String[] args) {
		// mom,dad, civic
		String s="CIVIC";
		String rev=rev(s);
		if(s.trim().equals(rev.trim()))
		{
			System.out.println("given string is polindrome");
		}
		else 
		{
			System.out.println("given string is not a polindrome");
		}


	}
	public static String rev(String s)
	{
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}

}
