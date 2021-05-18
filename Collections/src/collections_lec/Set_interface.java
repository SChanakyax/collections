package collections_lec;

import java.util.HashSet;
import java.util.TreeSet;

public class Set_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> data = new HashSet<>();
		
		data.add("Kumara");
		data.add("Lavanya");
		data.add("kapila");
		data.add("Kumara"); //no duplicate values
		data.add("kumara");
	/**/	
		System.out.println(data); //No order UNORDERED
		//foreach loop
		for(String x:data) {
			System.out.println(x);
		}
		
		System.out.println();
		
	TreeSet<String> tdata = new TreeSet<>();
		
		tdata.add("Kumara");
		tdata.add("Munas");
		tdata.add("kapila"); //simple k ????????? last
		tdata.add("Amarapala"); //no duplicate values
		tdata.add("Lavanya");
		tdata.add("Kumara");
		
		//System.out.println(tdata);
		for(String y:tdata) {
			System.out.println(y);
		}
		
		
	}

}
