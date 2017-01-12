package collections;

import java.util.*;

public class Addall {
	public static void main(String [] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();
		
		al.add("a");
		al.add("b");
		al.add("c");
		
		al2.add("a");
		al2.add("e");
		al2.add("b");
		al2.add("c");
		
		
		al.retainAll(al2);
		
		Iterator<String> itr =  al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
			
	}
}
