package hashtable;

import java.util.Hashtable;

public class HashtableDemoCustomInitialCapacity {

	public static void main(String[] args) {
		
		Hashtable h=new Hashtable(25);
		h.put(new Temp2(5), "A");
		h.put(new Temp2(2), "B");
		h.put(new Temp2(6), "C");
		h.put(new Temp2(15), "D");
		h.put(new Temp2(23), "E");
		h.put(new Temp2(16), "F");
//		adding null as value in Hashtable
//		RE:NPE
//		h.put("durga", null);
		System.out.println(h);
	}
}
class Temp2{
	int i;
	public Temp2(int i) {
		this.i=i;
	}
	@Override
	public int hashCode() {
		return i%9;
	}
	
	@Override
	public String toString() {
		return i+"";
	}
}
