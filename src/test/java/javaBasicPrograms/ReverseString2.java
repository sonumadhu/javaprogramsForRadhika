package javaBasicPrograms;

public class ReverseString2 {

	public static void main(String[] args) {
		// Welcome to tyss to-> ssyt ot emoclew
		String s="welcome to tyss";
		String[] arr=s.split(" ");
		
		for(int  i=arr.length-1; i>=0; i--)
		{
			System.out.print(rev(arr[i]));
			System.out.print(" ");
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
