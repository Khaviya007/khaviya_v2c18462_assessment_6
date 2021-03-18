package queue;
import java.util.Iterator;
import java.util.PriorityQueue;
public class priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add(" ");
		pq.add("apple");
		pq.add("samsung");
		pq.add("motorola");
		
		
		Iterator<String> i=pq.iterator();
		while(i.hasNext()) {
			System.out.println("The values are: "+i.next());
		}
		pq.remove();
		System.out.println("After removing remove:");
		Iterator<String> i1=pq.iterator();
		while(i1.hasNext()) {
			System.out.println("The values are: "+i1.next());
		}
  
		pq.poll();
		System.out.println("After removing poll");
		Iterator<String> i2=pq.iterator();
		while(i2.hasNext()) {
			System.out.println("The values are: "+i2.next());
		}
		
		pq.element();
		System.out.println("After removing element:");
		Iterator<String> i4=pq.iterator();
		while(i4.hasNext()) {
			System.out.println("The values are: "+i4.next());
		}
  
		pq.peek();
		System.out.println("After removing peek:");
		Iterator<String> i3=pq.iterator();
		while(i3.hasNext()) {
			System.out.println("The values are: "+i3.next());
		}
	}

}
