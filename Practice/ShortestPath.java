import java.util.*;
import java.lang.*;
import java.io.*;
 
class ShortestPath
{
    // A utility function to find the vertex with minimum distance value,
    // from the set of vertices not yet included in shortest path tree
    static int V;
    int minDistance(int dist[], Boolean sptSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index=-1;
 
        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min)
            {
                min = dist[v];
                min_index = v;
            }
 
        return min_index;
    }
 
    // A utility function to print the constructed distance array
    void printSolution(int dist[], int n)
    {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i+" \t\t "+dist[i]);
    }
 
    // Funtion that implements Dijkstra's single source shortest path
    // algorithm for a graph represented using adjacency matrix
    // representation
    void dijkstra(int graph[][], int src)
    {
        int dist[] = new int[V]; // The output array. dist[i] will hold
                                 // the shortest distance from src to i
 
        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean sptSet[] = new Boolean[V];
 
        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
 
        // Distance of source vertex from itself is always 0
        dist[src] = 0;
 
        // Find shortest path for all vertices
        for (int count = 0; count < V-1; count++)
        {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. u is always equal to src in first
            // iteration.
            int u = minDistance(dist, sptSet);
 
            // Mark the picked vertex as processed
            sptSet[u] = true;
 
            // Update dist value of the adjacent vertices of the
            // picked vertex.
            for (int v = 0; v < V; v++){
 
                // Update dist[v] only if is not in sptSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                if (v<u && !sptSet[v] && graph[u][v]!=0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u]+graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
                else if (u<v && !sptSet[v] && graph[v][u]!=0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u]+graph[v][u] < dist[v])
                    dist[v] = dist[u] + graph[v][u];}

                    
        }
 
        // print the constructed distance array
        printSolution(dist, V);
    }
 
    // Driver method
    public static void main (String[] args)
    {
        /* Let us create the example graph discussed above */
        Scanner in=new Scanner (System.in);
        System.out.println("Welcome");
        int t=in.nextInt();
        while(--t>=0)
        {
            V=in.nextInt();
            int k=in.nextInt();
            int x=in.nextInt();
            int n=in.nextInt();
            int s=in.nextInt();
            int graph[][] = new int[V][];
            for (int i=0;i<k;i++)
            {
                graph[i]=new int [i+1];
                for (int j=0;j<i;j++)
                {
                    if (i!=j && i>j)
                    {
                        graph[i][j]=x;
                    }
                }
            }
            for (int i=k;i<V;i++)
            graph[i]=new int [i+1];
            for (int i=k;i<k+n;i++)
            {
                
                int a=(in.nextInt()-1);
                int b=(in.nextInt()-1);
                int c=in.nextInt();
                if (a>b)
                graph[a][b]=c;
                else
                graph[b][a]=c;
            }
            /*for (int i=0;i<V;i++)
            {
                for (int j=0;j<i;j++)
                System.out.print(graph[i][j]+" ");
                System.out.println();
            }*/
        ShortestPath t2 = new ShortestPath();
        t2.dijkstra(graph, s-1);
        }
    }
}