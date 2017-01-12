package generics;

public class PrintTest {
	public static void main(String[] args)
	{
		Integer[] i = { 1 , 2 , 3 , 4 , 5};
		PrintArray.printAnyArray(i);
		Double[] d = {1.1 , 2.2 , 3.3 };
		PrintArray.printAnyArray(d);
		String[] s = {"hai"};
		PrintArray.printAnyArray(s);
		//Fraction[] f = { };
	}
}
