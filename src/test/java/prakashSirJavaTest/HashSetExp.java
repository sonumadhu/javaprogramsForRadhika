package prakashSirJavaTest;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Object> hs = new HashSet<>();
		
		hs.add('a');
		hs.add("hiiii");
		hs.add(null);// it accepts  only one null as value 
		hs.add(null);
		System.out.println(hs);
		HashSet<Object> hs1 = new HashSet<>();
		hs1.add('b');
		hs1.add("byeeee");
		hs1.add(10);
		hs1.add(null);
		System.out.println(hs1);
		hs1.addAll(hs);
		System.out.println(hs1);
	
	
		
		
		
		

	}

}
