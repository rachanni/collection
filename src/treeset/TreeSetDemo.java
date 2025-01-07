package treeset;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
//		adding heterogenous element
//		RE:ClassCastException
//		t.add(Integer.valueOf(10));
		
		
//		adding null to Non empty TreeSet
//		RE:NullPointerException
//		t.add(null);
		System.out.println(t);
		
//		adding duplicate element
//		no compile time or run time error simple return false 
		System.out.println(t.add("Z"));
		System.out.println(t);
	
	}
}
