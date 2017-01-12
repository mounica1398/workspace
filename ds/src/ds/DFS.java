package ds;
import java.util.Stack;

public class DFS {

		public Stack<Integer> st;
		public int vertices;
		DFS(int v)
		{
			vertices = v;
			st = new Stack<Integer>();
		}
		public void dfs(int a[][] , int source)
		{
			//int num = a[source].length - 1;
			int visited[] = new int[vertices+1];
			int i, element = source;
			visited[source] = 1;
			System.out.println(element + "\t");
			st.push(element);
			while(!st.isEmpty())
			{
				element = st.peek();
				i=0;
				while(i <= vertices)
				{
					if(a[element][i] == 1 && visited[i] == 0)
					{
						st.push(i);
						visited[i] = 1;
						element = i;
						System.out.println(element + "\t");	
					}
					i++;
				}
				st.pop();
			}
			
			
		}
		
}
