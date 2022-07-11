package prakashSirJavaTest;

public class AscendingElements {

	public static void main(String[] args) {
		// ascending order
		
		int a[]= {20,30,40,50,10};
		for(int i=0;i<a.length;i++)     // for outer loop iteration 
			                            // here we are using length-variable because given array is a array of elements(if it is a string we have to use length() method) 
		{
			for(int j=i+1;j<a.length;j++)  // comparing elements with outer loop elements
			{
				if(a[i]>a[j]) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
