package prakashSirJavaTest;

public class FirstminWithotBsort {

	public static void main(String[] args) {
		// first min without bsort
		
		int a[]= {20,30,40,50,10};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max>a[i]) {
				max=a[i];
				
			}
			
		}
		System.out.println(max);
		

	}

}
