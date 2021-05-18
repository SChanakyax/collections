package collections_lec;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Double> marks = new HashMap<>();	
	//Map<String, Double> marks = new HashMap<>(); also OK
		
		
		marks.put("Amal", 75.5);
		marks.put("Baron", 60.0);
		marks.put("Canish", 80.0);
		
		Set<Map.Entry<String, Double>> newset = marks.entrySet();
	
		for( Map.Entry<String, Double> val:newset) {
			System.out.println( "Keys = " + val.getKey() + "  Values :: " + val.getValue() );
			
		}
		
	/*Part 2*/	
		
	System.out.println(marks.get("Amal"));	
		
	Double res = marks.get("Amal");
	res = res+10;
	marks.put("Aaaaaaaaaaaaaaamaali", res);
	
	marks.put("Canish", 10.00); //older values replaced >>>
	
	for( Map.Entry<String, Double> val:newset) {
		System.out.println( "Keys = " + val.getKey() + "  Values :: " + val.getValue() );
		
	}
	
	
	
	}

}
