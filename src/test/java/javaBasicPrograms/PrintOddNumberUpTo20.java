package javaBasicPrograms;

public class PrintOddNumberUpTo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=20;i++) {
			if(i%2==1) {
				System.out.println(i+ "is odd");
			}
			else {
				System.out.println(i+ "is even");
			}
		}
	}

}
