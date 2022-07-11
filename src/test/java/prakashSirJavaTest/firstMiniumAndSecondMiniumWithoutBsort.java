package prakashSirJavaTest;

public class firstMiniumAndSecondMiniumWithoutBsort {

	public static void main(String[] args) {
		int a[]= {20,30,40,50,10};
		int Fmin=a[0];
		int Smin=a[0];
		for(int i=1;i<a.length;i++) { 
			if(a[i]<Fmin) { //change
				Smin=Fmin;
				Fmin=a[i];
			}
			else if(a[i]>Smin) 
			{
				Smin=a[i];
			}
		}
		System.out.println("First minimum"+" "+Fmin+" "+"Second minimum"+" "+Smin);
		

	}

}
