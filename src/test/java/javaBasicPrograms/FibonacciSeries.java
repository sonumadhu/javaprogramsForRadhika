package javaBasicPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13
		int i1=0;
		int i2=1;
		int i3;
		System.out.print(i1+" "+i2+" ");
		for( int i=0; i<=100; i++) {
			i3=i1+i2;
			if(i3>100)
			{
				break;
			}
		
		System.out.print(i3 + " ");
		i1=i2;
		i2=i3;

	}
	}
}
