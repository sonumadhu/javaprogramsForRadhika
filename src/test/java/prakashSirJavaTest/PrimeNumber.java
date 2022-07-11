package prakashSirJavaTest;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=7;
		int j=2;
		while(n>=j) {
			if(n%j==0) {
				break;
				
			}
			 {
				j++;
			}
			if(n==j) {
				System.out.println("prime");
				
			}
			
		}

	}

}
