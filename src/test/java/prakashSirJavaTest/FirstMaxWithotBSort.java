package prakashSirJavaTest;

public class FirstMaxWithotBSort {

	public static void main(String[] args) {
		// first maximum without using bSort
		
		int a[]= {20,30,40,50,10};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
				
			}
			
		}
		System.out.println(max);
		

	}

}
