package prakashSirJavaTest;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExp {

	public static void main(String[] args) {
		// example for tree set
		
		TreeSet<Object> set = new TreeSet<>();
		set.add('a');// it accepts only homogeneous type of data
		set.add('b');
		set.add('c');
		set.add('d');
		//set.add(3);//if we add heterogeneous data it will through null pointer exception at run time(run time exception)
		Iterator<Object> i=set.iterator();//act as for each loop 
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
