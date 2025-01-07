package comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new MyComparatorHeteroEle());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}
}

class MyComparatorHeteroEle implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		int length1=s1.length();
		int length2=s2.length();
		if(length1<length2) {
			return -1;
		}else if(length1>length2){
			return +1;
		}else {
			return s1.compareTo(s2); 
		}
	}
}
