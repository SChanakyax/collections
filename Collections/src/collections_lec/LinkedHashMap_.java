package collections_lec;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> lhm = new  LinkedHashMap<Integer,String>();
		
		lhm.put(10, "AAA");
		lhm.put(20, "BBB");
		lhm.put(9, "AAA");
		lhm.put(30, null);
		lhm.put(40, null);
		lhm.put(40, "CCC");
		lhm.put(50, "DDD");
	
	
		for(Integer key : lhm.keySet()) {
			System.out.println(key+ ", "+ lhm.get(key));
		}
		
	}
	
}
