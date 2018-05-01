package Codechef;
import java.util.*;


public class DISHOWN {
    static int find(int parent[], int i)
    {
//        System.out.println(i);
        if (parent[i]==-1)
            return i;
        else
            parent[i]=find(parent,parent[i]);
        return parent[i];
    }
    static void union(int parent[],int value[],int x,int y)
    {
        int xroot=find(parent,x);
        int yroot=find(parent,y);
        if (value[xroot]<value[yroot])
            parent[xroot]=yroot;
        else if (value[xroot]>value[yroot])
            parent[yroot]=xroot;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int n=in.nextInt();
            int value[]=new int [n];
            int parent[]=new int [n];
            for (int i=0;i<n;i++) {
                value[i]=in.nextInt();
                parent[i]=-1;
            }
            int q=in.nextInt();

            while (--q>=0)
            {
                int a=in.nextInt();
                if (a==0)
                {
                    int x=in.nextInt()-1;
                    int y=in.nextInt()-1;
//                    System.out.println(x+" "+y);
                    int t1=find(parent,x);
                    int t2=find(parent,y);
                    if (t1==t2)
                        System.out.println("Invalid Query");
                    else
                        union(parent,value,x,y);
                }
                else if (a==1)
                {
                    int x=in.nextInt()-1;
                    System.out.println((find(parent,x)+1));
                }
            }
        }
    }
}
