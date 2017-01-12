package ds;
import java.util.Scanner;
import java.util.InputMismatchException;
public class BfsDriver {
	public static void main(String[]args)
	{
		int v , s ;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter no. of vertices");
			v = sc.nextInt();
			BFS b = new BFS(v);
			System.out.println("Enter no. of edges");
			int e = sc.nextInt();
			for(int i = 0 ; i < e ; i++)
			{
				System.out.println("Enter the edges");
				b.addEdge(sc.nextInt(), sc.nextInt());
			}
			System.out.println("Enter source");
			s = sc.nextInt();
			b.bfs(s);	
		}catch(InputMismatchException i)
		{
			System.out.println("wrong input format");
		}
		sc.close();
		
	}
}
