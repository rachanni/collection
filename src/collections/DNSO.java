package collections;

import java.util.ArrayList;
import java.util.Collections;

public class DNSO {

	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		
		
//		adding heterogenous element 
//		l.add(Integer.valueOf(10));
		
		
//		adding null 
//		l.add(null);
		System.out.println("Before sorting: "+l);
		Collections.sort(l);
		System.out.println("After sorting: "+l);
	}
}
