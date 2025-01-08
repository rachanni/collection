package collections;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {

	public static void main(String[] args) {
		
		int[]a= {10,5,20,11,6};
		System.out.println("Primitive array before sorting:");
		for(int a1:a) {
			System.out.print(a1+", ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.println("Primitive array after sorting:");
		for(int a1:a) {
			System.out.print(a1+", ");
		}
		System.out.println();
		String[]s= {"A","Z","B"};
		System.out.println("Object array before sorting:");
		for(String s1:s) {
			System.out.print(s1+", ");
		}
		System.out.println();
		Arrays.sort(s);
		System.out.println("Object array after sorting:");
		for(String s1:s) {
			System.out.print(s1+", ");
		}
		System.out.println();
		Arrays.sort(s,new MyComparatorArrays());
		System.out.println("Object array after sorting by comparator: ");
		for(String s1:s) {
			System.out.print(s1+", ");
		}
		
	}
}
class MyComparatorArrays implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}
