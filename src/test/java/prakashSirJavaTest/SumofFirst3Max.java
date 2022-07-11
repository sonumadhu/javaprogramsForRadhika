package prakashSirJavaTest;

public class SumofFirst3Max {

	public static void main(String[] args) {
		// sum of first max numbers
		
		int a[]= {20,30,40,50,10};   /* in this program first we have 
		                             to sort the given string in to ascending order*/
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[j]>a[i]) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//50,30,40,20,10
		//0,1,2,3,4
          int sum=0;
		for(int i=0; i<3;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	


	}


