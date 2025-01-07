package comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new MyComparatorString());
		t.add("Roja");
		t.add("Shobharani");
		t.add("Rajakumari");
		t.add("Gangabhavani");
		t.add("Ramulamma");
		System.out.println(t);
		
	}
}

class MyComparatorString implements Comparator{
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		
		return s2.compareTo(s1);
	}
}