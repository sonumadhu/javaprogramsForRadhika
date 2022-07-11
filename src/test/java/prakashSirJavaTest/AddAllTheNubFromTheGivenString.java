package prakashSirJavaTest;

public class AddAllTheNubFromTheGivenString {

	public static void main(String[] args) {
		// 
		
		String s="a7#b3@c9&";
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int n=s.charAt(i)-48; // 49 ASCII value of 0; 48 is the ASCII value of 0 ==> so 49-48=1 ; to convert from ASCII value frm normal value
				 
				System.out.println(n);
				
				sum=sum+n;
			}
			
		}
		System.out.println("sum of given numbers "+sum);

	}

}
