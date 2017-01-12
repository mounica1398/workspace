package generics;

public class AddDriver {

		public static void main(String [] args)
		{
			AddGeneric.addType(new Integer(10), new Integer(20));
			AddGeneric.addType(new Double(10.9), new Double(20.5));
			AddGeneric.addType(new String("hai"), new String("java"));
			AddGeneric.addType(new Fraction(1,2), new Fraction(3,3));
		}
	
}
