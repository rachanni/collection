package priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue q=new PriorityQueue();
		
//		peek() method return head element of the queue if queue is empty then this method return null
		System.out.println(q.peek());
		
		
//		element() method return head element of the queue. If queue is empty then RE:NoSuchElementException
//		System.out.println(q.element());
		
		
		for(int i=0;i<=10;i++) {
			q.offer(i);
		}
		System.out.println(q);
		
		
//		to return and remove head element of the Queue. if Queue is empty then this method returns null.
		System.out.println(q.poll());
		
		
		System.out.println(q);
	}
}
