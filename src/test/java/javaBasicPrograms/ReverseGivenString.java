package javaBasicPrograms;

public class ReverseGivenString {

	public static void main(String[] args) {
		// reverse given statement and use split method to give space
		String s="welcome to tyss";
		String[] arr=s.split(" ");
		
		for(int i=0;i<arr.length; i++)
		{
			System.out.print(rev(arr[i]));
			System.out.print("");
		}
	}
		
public static String rev(String s)
{
	String rev= " ";
	for(int i=s.length()-1;i>=0;i--) 
	{
		rev=rev+s.charAt(i);
	}
	return rev;
}
	}
	


