package Codechef;

import java.util.*;

public class WEASELTX {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int q=in.nextInt();
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
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
        //System.out.println(al);
        long arr[][]=new long [501][n];
        for (int i=0;i<n;i++)
        {
            arr[0][i]=in.nextInt();
        }
//        int check[]=new
        for (int i=1;i<501;i++)
        {
            for (int j=n-1;j>=0;j--)
            {
                ArrayList<Integer> al1=al.get(j);
                if (al1.size()==0)
                    arr[i][j]=arr[i-1][j];
                else
                {
                    long xo=arr[i-1][j];
                    for (int k=al1.size()-1;k>=0;k--)
                    {
                        xo=xo^arr[i][al1.get(k)];
                    }
                    arr[i][j]=xo;
                }
            }
        }
//        for (int i=0;i<501;i++) {
//            System.out.print(i+" ");
//            for (int j = 0; j < n; j++)
//                System.out.print(arr[i][j] + " ");
//            System.out.println();
//        }
        for (int i=0;i<q;i++)
        {
            long z=in.nextLong();
            System.out.println(arr[(int)z][0]);
        }
    }
}
