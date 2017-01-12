package ds;
import java.util.Queue;
import java.util.LinkedList;

public class BFS {
	public Queue<Integer> q;
	public int vertices;
	int a[][] = new int[vertices][vertices];
	BFS(int v)
	{
		q = new LinkedList<Integer>();
		vertices = v;
		a = new int[vertices][vertices];
		
	}
	public void addEdge(int one , int two)
	{
		if(one >=0 && two >=0 && one < vertices && two < vertices)
		{
			a[one][two] = 1;
			a[two][one] = 1;
		}		
	}
	public boolean isEdge(int one , int two)
	{
		if( a[one][two] == 1)
			return true;
		else
			return false;
	}
	public void bfs(int source)
	{
		int visited[] = new int[vertices];
		int i,element;
		visited[source] = 1;
		q.add(source);
		while(!q.isEmpty())
		{
			element = q.remove();
			i=0;
			System.out.println(element + "\t");
			while( i < vertices)
			{
				if( a[element][i] == 1 && visited[i] == 0 )
				{
					q.add(i);
					visited[i] = 1;
				}
				i++;
			}
		}
	    int j;
		for( j = 0 ; j < vertices ; j++)
		{
			if(visited[j] == 0)
				break;		
		}
		if(visited[j] == 0)
			System.out.println("Graph is not connected");
		else
			System.out.println("Graph is connected");
			
	}
	

	
}
