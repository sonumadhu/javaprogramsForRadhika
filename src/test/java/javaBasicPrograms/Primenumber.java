package javaBasicPrograms;

public class Primenumber {

	public static void main(String[] args) {
	int a=14;
	boolean flag=false;
	for(int i=2;i<a;i++) 
	{
		if(a%i==0) {
			flag=true;
			break;
		}
	}
	if(!flag) {
		System.out.println("the given number is prime");
	}
	else {
		System.out.println("the given number is not a prime number");
	}

	}

}
