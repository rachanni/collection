package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		l.add("A");
		l.add("10");
		l.add("A");
		l.add(null);
		System.out.println(l);
//		remove element at index 2
		l.remove(2);
		System.out.println(l);
//		add element at index 2
		l.add(2,"M");
//		add element at last 
		l.add("N");
		System.out.println(l);
	}
}
