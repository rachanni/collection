package collections;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListDemo {

	public static void main(String[] args) {
		
		String[]s= {"A","Z","B"};
		List l=Arrays.asList(s);
		System.out.println(l);
		s[0]="K";
		System.out.println(l);
		l.set(1, "L");
		for(String s1:s) {
			System.out.print(s1+", ");
		}
//		adding element using List reference
//		RE:UnsupportedOperationException
//		l.add("durga");
		
		
//		removing element through List refernce
//		RE:UnsupportedOperationException
//		l.remove(2);
		
		
//		adding heterogenous element through List refernce
//		RE:ArraysStoreException
//		l.set(1, Integer.valueOf(10));
		
	}
}
