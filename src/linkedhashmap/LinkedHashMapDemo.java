package linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap l=new LinkedHashMap();
		l.put("chiranjeevi", 700);
		l.put("balaiah", 800);
		l.put("venkatesh", 200);
		l.put("nagarjuna", 500);
		System.out.println(l);
		System.out.println(l.put("chiranjeevi",1000));
		Set s=l.keySet();
		System.out.println(s);
		Set s1=l.entrySet();
		System.out.println(s1);
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"---"+m1.getValue());
			if(m1.getKey().equals("nagarjuna")) {
				m1.setValue(10000);
			}
			
		}
		
		System.out.println(l);
	}
}
