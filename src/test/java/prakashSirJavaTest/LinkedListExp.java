package prakashSirJavaTest;

import java.util.LinkedList;

public class LinkedListExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Object> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add("hi");
		list.add('a');
		list.addFirst("hello");
		System.out.println(list);
		list.addLast("bye");
		System.out.println(list);
		System.out.println(list.getLast());
		System.out.println(list.getFirst());
	}

}
