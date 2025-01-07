package cursor;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		System.out.println(l);
		ListIterator litr=l.listIterator();
		while(litr.hasNext()) {
			String s=(String)litr.next();
			if(s.equals("venki")) {
				litr.remove();
			}else if(s.equals("nag")) {
				litr.add("chaitu");
			}else if(s.equals("chiru")) {
				litr.set("charan");
			}
		}
		System.out.println(l);
		
	}
}
