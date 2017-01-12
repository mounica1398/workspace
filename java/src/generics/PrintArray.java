package generics;

public class PrintArray{
	public static <T> void printAnyArray(T[] arr)
	{
		for(int i =0; i< arr.length;i++)
			System.out.println(""+ arr[i]);
		System.out.println();
		
	}
}