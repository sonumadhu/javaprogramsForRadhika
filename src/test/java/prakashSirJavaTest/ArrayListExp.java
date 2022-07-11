package prakashSirJavaTest;

import java.util.ArrayList;

public class ArrayListExp {

	public static void main(String[] args) {

	 ArrayList<Object> list = new ArrayList<>();
	 
	 list.add(10);
	 list.add('a');
	 list.add("hi");
	 list.add(10);
	 list.add(3);
	 list.remove(4);//based on index
	 if(list.contains('a')) {
		 System.out.println("present");
		 
	 }
	 else {
		 System.out.println("not present");
	 }
	
     System.out.println(list);
	
	ArrayList<Object> list1 = new ArrayList<>();
	list1.add('b');
	list1.add("byeee");
	list1.add(10);
	list1.add(3);
	System.out.println(list1);
	list1.retainAll(list);
	System.out.println(list1);
	
	 
    
	}
	

}
