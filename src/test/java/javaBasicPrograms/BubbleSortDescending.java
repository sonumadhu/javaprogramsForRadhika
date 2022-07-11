package javaBasicPrograms;

public class BubbleSortDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {12,54,78,19,7,420};
		for( int j=0;j<arr.length;j++) 
		{
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i-1]<arr[i])
				{
					int temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		for(int data:arr)
		{
			System.out.print(data+ " ");
		}
		}


	}


