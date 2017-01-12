package collections;

import java.util.*;

public class Lhmap {
	public static void main( String [] args)
	{
		LinkedHashMap<Integer, String>  hm = new LinkedHashMap<Integer, String>();
		hm.put(1, "a");
		hm.put(2, "b");
		
		for(Map.Entry m : hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue()); 
	}

}
