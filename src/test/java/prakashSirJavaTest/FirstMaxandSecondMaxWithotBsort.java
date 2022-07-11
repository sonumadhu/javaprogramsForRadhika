package prakashSirJavaTest;

public class FirstMaxandSecondMaxWithotBsort {

	public static void main(String[] args) {
		// 
		int a[]= {20,30,40,50,10};
		int Fmax=a[0];
		int Smax=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>Fmax) {
				Smax=Fmax;
				Fmax=a[i];
			}
			else if(a[i]>Smax) 
			{
				Smax=a[i];
			}
		}
		System.out.println(Fmax+" "+Smax);
		
	}

}
