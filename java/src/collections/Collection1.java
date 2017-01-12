package collections;
import java.util.*;

public class Collection1 {
	public static void main(String [] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("ab");
		al.add("cd");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//list
		List<String> al1 = new ArrayList<String>();
		al1.add("hello");
		al1.add("hai");
		System.out.println("ArrayList" + al1);
		
	}

}
