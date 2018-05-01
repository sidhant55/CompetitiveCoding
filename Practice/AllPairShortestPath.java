import java.util.*;

public class AllPairShortestPath
{
	final static int INF = 99999;
	static int V;
 
    int[][] floydWarshall(int graph[][])
    {
        int dist[][] = new int[V][V];
        int i, j, k;
 
        /* Initialize the solution matrix same as input graph matrix.
           Or we can say the initial values of shortest distances
           are based on shortest paths considering no intermediate
           vertex. */
        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
                dist[i][j] = graph[i][j];
 
        /* Add all vertices one by one to the set of intermediate
           vertices.
          ---> Before start of a iteration, we have shortest
               distances between all pairs of vertices such that
               the shortest distances consider only the vertices in
               set {0, 1, 2, .. k-1} as intermediate vertices.
          ----> After the end of a iteration, vertex no. k is added
                to the set of intermediate vertices and the set
                becomes {0, 1, 2, .. k} */
        for (k = 0; k < V; k++)
        {
            // Pick all vertices as source one by one
            for (i = 0; i < V; i++)
            {
                // Pick all vertices as destination for the
                // above picked source
                for (j = 0; j < V; j++)
                {
                    // If vertex k is on the shortest path from
                    // i to j, then update the value of dist[i][j]
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
 
        // Print the shortest distance matrix
        return dist;
    }
 
    void printSolution(int dist[][])
    {
        System.out.println("Following matrix shows the shortest "+
                         "distances between every pair of vertices");
        for (int i=0; i<V; ++i)
        {
            for (int j=0; j<V; ++j)
            {
                if (dist[i][j]==INF)
                    System.out.print(-1+" ");
                else
                    System.out.print(dist[i][j]+"   ");
            }
            System.out.println();
        }
    }
	public static void main (String args[])
	{
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		V=n;
		int m=in.nextInt();
		int graph[][]=new int [n][n];
		for (int i=0;i<m;i++)
		{
			int a=in.nextInt();
			int b=in.nextInt();
			int r=in.nextInt();
			graph[a-1][b-1]=r;

		}
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if (graph[i][j]==0 && i!=j)
					graph[i][j]=INF;
			}
		}

		AllPairShortestPath a = new AllPairShortestPath();
 
        // Print the solution
        graph=a.floydWarshall(graph);
        int q=in.nextInt();
        for (int i=0;i<q;i++)
        {
        	int x=in.nextInt();
        	int y=in.nextInt();
        	if (graph[x-1][y-1]==INF)
        		System.out.println(-1);
        	else
        		System.out.println(graph[x-1][y-1]);
        }
	}
}