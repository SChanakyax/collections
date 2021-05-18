package collections_lec;

import java.util.ArrayList;
import java.util.Stack;
import java.util.PriorityQueue;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/************************************************************************/
/*ARRAYLIST*/
		ArrayList<Integer> pages = new ArrayList<Integer>();
		
		pages.add(10);
		pages.add(12);
		pages.add(42);
		pages.add(49);
		pages.add(50);
		
		System.out.println(pages);
		
		pages.remove(1); //can remove from any place
		
		System.out.println(pages);
		
		pages.add(110);
		pages.add(111);
		pages.add(0, 1);
		
		System.out.println(pages);
	
		System.out.println("Size of the arrayList:: " + pages.size());
	
		//Display arraylist items (into a variable)
		for(Integer x:pages) {
			System.out.println(x);
		}
		
		//ArrayList to a normal array 
		//set size
		Integer pageset[] = new Integer[pages.size()];
		
		//copy content
		pageset = pages.toArray(pageset);
		
		//Display the normal array
		for(int x=0;x<pageset.length;x++) {
			System.out.println("Element : " + (x+1) + " Value :: " + pageset[x]);
		}
/*ARRAYLIST*/		
/***************************************************************************************/		
/*STACK class*/
System.out.println("\n\nStack:::::::::::::::::::::::::::::");
	Stack<Integer> plates = new Stack<>();
	
	plates.add(1);
	plates.add(2);
	plates.push(3);
	
	System.out.println(plates);
	
	plates.pop();
	
	//plates.pop();
	
	System.out.println(plates);

/*STACK class*/
/****************************************************************************/	
	
/* [QUEUE INTERFACE] */
System.out.println("\n\nPriorityQueue:::::::::::::::::::::::::::::");	
	PriorityQueue<String> bankq = new PriorityQueue<>();
	
	bankq.add("A");
	bankq.add("B");
	bankq.add("C");
	
	System.out.println(bankq);
	
	bankq.add("D");
	
	System.out.println(bankq);
	
	System.out.println("First Customer ::" + bankq.peek());
	System.out.println("Remove Customer ::" + bankq.poll());
	
	bankq.add("E");	
	
	System.out.println(bankq);	
	
/* [QUEUE INTERFACE] */	
/***************************************************************************/	
	}

}
