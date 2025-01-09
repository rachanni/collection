package collections;

import  java.util.Arrays;
import java.util.Comparator;

public class ArraySearchDemo {

	public static void main(String[] args) {
		
		int []a= {10,5,20,11,6};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 14));
		String[]s= {"A","Z","B"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "Z"));
		System.out.println(Arrays.binarySearch(s, "S"));
		Arrays.sort(s,new MyComparatorArraysBinarySearch());
		System.out.println(Arrays.binarySearch(s, "Z",new MyComparatorArraysBinarySearch()));
		System.out.println(Arrays.binarySearch(s, "S",new MyComparatorArraysBinarySearch()));
		System.out.println(Arrays.binarySearch(s, "N"));
		
	}
}
class MyComparatorArraysBinarySearch implements Comparator{
	
	public int compare(Object obj1,Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}