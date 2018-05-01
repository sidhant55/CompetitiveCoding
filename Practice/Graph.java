// Java program to print DFS traversal from a given given graph
import java.io.*;
import java.util.*;

class Graph
{
    private int V;   // No. of vertices
 
    // Array  of lists for Adjacency List Representation
    private LinkedList<LinkedList<Integer>> adj=new LinkedList<LinkedList<Integer>>();
    TreeSet<Integer> tm=new TreeSet<Integer>();
    int ar[];
 
    // Constructor
    Graph(int v)
    {
        V = v;
    }
 
    void update(LinkedList<LinkedList<Integer>> ad, int a[])
    {
        adj=ad;
        ar=a;
    }
 
    //A function used by DFS
    void DFSUtil(int v,boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v+" ");
 
        // Recur for all the vertices adjacent to this vertex
        LinkedList<Integer> a;
        a=adj.get(v);
        Iterator<Integer> i = a.listIterator();
        while (i.hasNext())
        {

            int n = i.next();
            
            if (!visited[n])
            {
                tm.add(ar[v]-ar[n]);
                DFSUtil(n, visited);
                tm.add(ar[v]-ar[n]);
            }
        }
    }
 
    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS(int v)
    {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];
 
        // Call the recursive helper function to print DFS traversal
        DFSUtil(v, visited);

        System.out.println(tm);
    }
 
    public static void main(String args[])
    {
        LinkedList<LinkedList<Integer>> ad=new LinkedList<LinkedList<Integer>>();
        int tar=0;
        LinkedList<Integer> a;
        Scanner in=new Scanner (System.in);
        int t=in.nextInt();
        Graph g = new Graph(t);
        int arr[]=new int [t];
        for (int i=0;i<t;i++)
        {
            ad.add(new LinkedList<Integer>());
            arr[i]=in.nextInt();
        }
        for (int i=0;i<t;i++)
        {
            int x=in.nextInt();
            if (x!=-1)
            {
                a=ad.get(x-1);
                a.add(i);
            }
            else
                tar=i;

        }
        g.update(ad,arr);

            for (int i=0;i<t;i++)
            {
                a=ad.get(i);
                System.out.println(i+" "+a);
            }

        
 
        g.DFS(tar);
    }
}