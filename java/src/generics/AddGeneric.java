package generics;

public class AddGeneric {
	public static <T> void addType(T one, T two)
	{
		 if(one.getClass() == Integer.class)
			 System.out.println((Integer)one+(Integer)two);
		 if(one.getClass() == Double.class)
			 System.out.println((Double)one+(Double)two);
		 if(one.getClass() == String.class)
			 System.out.println((String)one+(String)two);
		 if(one.getClass() == Fraction.class)
		 {
			 Fraction af = new Fraction();
			 af = Fraction.add((Fraction)one, (Fraction)two);
			 System.out.println(af);
		 }
			 
		 
	}
}