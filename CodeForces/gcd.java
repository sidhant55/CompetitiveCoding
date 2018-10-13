package CodeForces;

import java.util.*;

public class gcd {

    public static int g(int a, int b)
    {
        if(a==0)
            return b;
        return g(b%a,a);
    }

    public static void prime(int n)
    {

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int ans=arr[0];

        for(int i=1;i<n;i++)
            ans=g(ans,arr[i]);

        int lo=1;
        int hi=15000000;

        while(lo<=hi)
        {

        }


    }
}
