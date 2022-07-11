package prakashSirJavaTest;

public class ShiftFirstTwoPositionstoLastTwoP {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		
		for(int j=0;j<2;j++) {
			int temp=a[0];
			
			for(int i=1;i<a.length;i++) {
				
				a[i-1]=a[i];       /*this line is used to shift the positions to left (towards left)*/
				}
			
			a[a.length-1]=temp;   /* this line is used to shift the first two positions to last(towards right )*/
			
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");	
		}
		

	}
	

}
