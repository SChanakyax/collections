package collections_Lec_part2;


import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	SortedMap<Integer,String> tmdata = new TreeMap<Integer,String>();
	
	tmdata.put(10, "A");
	tmdata.put(9, "B");
	tmdata.put(1, "C");
	tmdata.put(20, "D");
	tmdata.put(11, "E"); 
	//cbaed
	
	for (Map.Entry<Integer, String> mapEntry : tmdata.entrySet())
	{
		System.out.println(mapEntry.getKey() + "  " + mapEntry.getValue());
	}
	
	}

}
