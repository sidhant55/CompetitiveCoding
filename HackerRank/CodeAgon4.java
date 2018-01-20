package HackerRank;

import java.util.*;

public class CodeAgon4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int k=in.nextInt();
        int arr[]=new int [n];
        long brr[]=new long[n];
        int start=0, end=0;
        HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
        int c=0;
        for (int i=0;i<n;i++) {
            arr[i] = in.nextInt();
            if (arr[i]==1)
            {
                c++;
                hm.put(c,i);
                end=i;
            }
        }
        //System.out.println(c);
        long min=Long.MAX_VALUE;
        System.out.println(hm);
        int ind=0;
        int ind1=0;
        long cost=0;
        int count=0;
        int j=1;
        brr[0]=0;
        for (int i=0;i<n;i++)
        {
            if (arr[i]==1)
            {
                if (count==0) {
                    cost += i;
                    start=i;
                }
                else
                {
                    cost+=(i-start)*count*k;
                    start=i;
                }
                count++;
                if (count==m)
                {
                    brr[j]=brr[j-1]+cost;
                    j++;
                    cost-=0;
                    count--;
                }
            }
        }
        for (int i=0;i<j;i++)
        {
//            if (brr[j]<min)
//                min=brr[j];
            System.out.print(brr[i]+" ");
        }
        //System.out.println(min);
    }
}
