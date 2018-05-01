package Codechef;

import java.util.*;
import java.io.*;

public class WEASLTX3 {

    static ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
    static long arr[];
    static ArrayList<Long> ans=new ArrayList<Long>();

    static long DFSUtil(int v,boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        //System.out.print(v+" ");

        // Recur for all the vertices adjacent to this vertex
        long x=arr[v];
        for (int i=0;i<al.get(v).size();i++)
        {
            if (visited[al.get(v).get(i)]==false)
                x=x^DFSUtil(al.get(v).get(i),visited);
            arr[v]=x;
        }
        return x;
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    static long DFS(int v,int n)
    {
        boolean visited[] = new boolean[n];
        return(DFSUtil(v, visited));
    }

    public static void main(String args[]) {
        inputs in = new inputs(System.in);
        int n=in.nextInt();
        int q=in.nextInt();
        //ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<n;i++) {
            al.add(new ArrayList<Integer>());
        }
        for (int i=0;i<n-1;i++)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            al.get(a).add(b);
            al.get(b).add(a);
        }
        arr=new long [n];
        for (int i=0;i<n;i++)
            arr[i]=in.nextLong();
        //ArrayList<Long> ans=new ArrayList<Long>();
        ans.add(arr[0]);
        int k=1;
        long tp=-1;
        while(ans.get(0)!=tp)
        {
            ans.add(DFS(0,n));
            tp=ans.get(k);
            k++;
        }

        for (int i=0;i<q;i++)
        {
            long z=in.nextLong();
            long y=z%(k-1);
            System.out.println(ans.get((int)y));
        }
    }
}
class inputs
{
    public BufferedReader reader;
    public StringTokenizer token;

    inputs(InputStream str)
    {
        reader=new BufferedReader(new InputStreamReader(str));
        token=null;
    }

    int nextInt()
    {
        while(token==null||!token.hasMoreTokens())
        {
            try { token=new StringTokenizer(reader.readLine());   }
            catch(IOException e){  throw new RuntimeException(e); }
        }
        return Integer.parseInt(token.nextToken());
    }

    long nextLong()
    {
        while(token==null||!token.hasMoreTokens())
        {
            try { token=new StringTokenizer(reader.readLine());   }
            catch(IOException e){  throw new RuntimeException(e); }
        }
        return Long.parseLong(token.nextToken());
    }

    String next()
    {
        while(token==null||!token.hasMoreTokens())
        {
            try { token=new StringTokenizer(reader.readLine());   }
            catch(IOException e){  throw new RuntimeException(e); }
        }
        return token.nextToken();
    }

}