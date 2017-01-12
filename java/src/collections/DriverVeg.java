package collections;

import java.util.*;


public class DriverVeg {

	private static Scanner s;

	public static void main (String[] args){
		String ch1, ch2, ch3, ch4;
		ArrayList<Vegetable> al = new ArrayList<Vegetable>();
		Vegetable v1 = new Vegetable("Cabbage");
		Vegetable v2 = new Vegetable("Tomatoes");
		Vegetable v3 = new Vegetable("Spinach");
		Vegetable v4 = new Vegetable("Bitter Melon");
		s = new Scanner(System.in);
		for(int i=1; i<11; i++){
			System.out.println(" Enter "+ i +"th set of Grades for each vegetable" );
			ch1 = s.next();
			ch2 = s.next();
			ch3 = s.next();
			ch4 = s.next();
			
			v1.count(ch1);
			v2.count(ch2);
			v3.count(ch3);
			v4.count(ch4);
			
		}
		
		al.add(v1);
		al.add(v2);
		al.add(v3);
		al.add(v4);
		
		Iterator<Vegetable> itr = al.iterator();
		while(itr.hasNext()){
			Vegetable v = itr.next();
			System.out.println(v.vegetable_name + " " + v.count);
		}
		
		
	}
}
