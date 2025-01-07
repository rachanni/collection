package comparable;

public class CompareToMethodDemo {

	public static void main(String[] args) {
		
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("A"));
		System.out.println("A".compareTo("A"));
//		comparing String object with null
//		RE:NullPointerException
//		System.out.println("A".compareTo(null));
	}
}
