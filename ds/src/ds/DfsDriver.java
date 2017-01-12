package ds;
import java.util.Scanner;

public class DfsDriver {
	private static Scanner s;

	public static void main(String [] args)
	{
		s = new Scanner(System.in);
		int v, source;
		System.out.println("enter the no. of vertices");
		v = s.nextInt();
		DFS d = new DFS(v);
		int a[][] = new int[v+1][v+1];
		System.out.println("Enter the adjacency matrix");
	    for (int i = 1; i <= v; i++)
	    {
	    	for (int j = 1; j <= v; j++)
	    	{
	    		a[i][j] = s.nextInt();;
	    	}
	    }
	    System.out.println("enter source");
	    source = s.nextInt();
	    d.dfs(a, source);
	    
	    	

		
	}

}
