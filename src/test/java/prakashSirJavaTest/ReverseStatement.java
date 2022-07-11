package prakashSirJavaTest;

public class ReverseStatement {

	public static void main(String[] args) {
		// reverse the complete statement
		
		String s= " welcome to tyss banglore";
		String str[]=s.split(" ");
		for(int i=str.length-1;i>0;i--) {
			System.out.print(str[i]+" ");
		}

	}

}
