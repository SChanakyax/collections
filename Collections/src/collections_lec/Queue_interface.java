package collections_lec;

import java.util.PriorityQueue;

public class Queue_interface {

public static void main(String[] args) {
	
	PriorityQueue<Integer> bankQueue = new PriorityQueue<Integer>();
	
	bankQueue.add(10);
	bankQueue.add(20);
	bankQueue.add(34);
	
	System.out.println(bankQueue);//display queue
	
	//display the 1st element
	System.out.println("Queue Peek :: " + bankQueue.peek());
	
	//delete elements from queue
	System.out.println("Queue Poll :: " + bankQueue.poll());
	
	System.out.println("Queue Poll :: " + bankQueue.poll());
	
	System.out.println(bankQueue);//display queue
}
	
}
