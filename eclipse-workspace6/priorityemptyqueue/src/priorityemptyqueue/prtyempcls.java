package priorityemptyqueue;

import java.util.PriorityQueue;

public class prtyempcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq=new PriorityQueue<String>();
		System.out.println("poll is: "+pq.poll());
		System.out.println("peek is: "+pq.peek());
		System.out.println("element is: "+pq.element());
		System.out.println("remove is: "+pq.remove());
	}

}
