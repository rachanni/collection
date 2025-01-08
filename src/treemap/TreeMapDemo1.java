package treemap;

import java.util.TreeMap;

//Default natural sorting order 
public class TreeMapDemo1 {

	public static void main(String[] args) {
		
		TreeMap m=new TreeMap();
		m.put(100, "ZZZ");
		m.put(103, "YYY");
		m.put(101, "XXX");
//		adding heterogenous value to TreeMap
		m.put(104, 106);
		
//		adding heterogenous key to TreeMap
//		RE:ClassCastException
//		m.put("FFF","XXX");
		
		
//		adding null as key
//		RE:NullPointerException
//		m.put(null, "XXX");
		
		System.out.println(m);
	}
}
