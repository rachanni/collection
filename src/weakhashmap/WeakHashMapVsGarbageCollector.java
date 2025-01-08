package weakhashmap;

import java.util.WeakHashMap;

public class WeakHashMapVsGarbageCollector {

	public static void main(String[] args) throws InterruptedException {
		
		WeakHashMap w=new WeakHashMap();
		Temp t=new Temp();
		w.put(t,"durga");
		System.out.println(w);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(w);
	}
}
class Temp{
	
	@Override
	public String toString() {
		return "temp";
	}
	public void finalize() {
		System.out.println("Finalize method called");
	}
}
