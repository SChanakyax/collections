package collections_lec;

import java.util.ArrayList;

public class ArrayLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(100);
		arrayList.add(300);
		arrayList.add(700);
		arrayList.add(300);
		arrayList.add(600);
		
		arrayList.add(1, 1000);
		arrayList.remove(0);
		System.out.println("Array List :: " + arrayList);
		System.out.println("Array List SIZE :: " + arrayList.size());
		
		//no need to hard quote
		Integer array[] = new Integer[arrayList.size()];//normal array 
		
		//to copy arrayList >> array
		array = arrayList.toArray(array);
		/*
		for(int x=0;x<array.length;x++){
			System.out.println("Element :: " +(x+1) + " = " + array[x] );
		}	
		*/
		
		//display arrayList
		for(Integer a :arrayList) {
			System.out.println(a);
		}	

	}

}
