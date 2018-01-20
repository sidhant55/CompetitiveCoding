package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Equal {
    public static void main (String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(--t>=0)
        {
            long mn=1000;
            int n=in.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=in.nextLong();
                mn=Math.min(mn,arr[i]);
            }
            long res=1000000000;
            for (long m=Math.max(0,mn-4);m<=mn;m++)
            {
                long cnt=0;
                for (int i=0;i<n;i++)
                {
                    long temp=arr[i]-m;
                    cnt+=temp/5+(temp%5)/2+(temp%5)%2;
                }
                res=Math.min(res,cnt);
            }
            System.out.println(res);
        }
    }

}
