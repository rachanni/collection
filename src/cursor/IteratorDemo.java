package cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	
	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		for(int i=0;i<=10;i++) {
			l.add(i);
		}
		System.out.println(l);
		Iterator i=l.iterator();
		
		while(i.hasNext()) {
			int element=(Integer)i.next();
			if(element%2==0) {
				System.out.println(element);
			}else {
				i.remove();
			}
		}
		System.out.println(l);
	}
}
