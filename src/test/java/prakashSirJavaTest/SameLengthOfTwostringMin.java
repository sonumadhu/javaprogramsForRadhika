package prakashSirJavaTest;

public class SameLengthOfTwostringMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"hello","hi","am","abc","welcome","tyss"};
		String min=str[0];
		for(int i=0;i<str.length;i++) {
			if(min.length()>str[i].length()) {
				min=str[i];
				
			}
		}
		//System.out.println(min);
		for(int i=0;i<str.length;i++) {
			if(min.length()==str[i].length()) {
				System.out.println(str[i]);
				
			}
		}


	}

}
