package DynamicProgramming;

import java.util.*;

public class RhezoPrime {
    static boolean[] sieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
//        for(int i = 1; i <= n; i++)
//        {
//            if(prime[i] == true)
//                System.out.print(i + " ");
//        }

        return prime;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean prime[]= sieveOfEratosthenes(n+1);

        int l=2;
        for (int i=n;i>=2;i--)
        {
            if (prime[i]==true)
            {
                l=i;
                break;
            }
        }
        System.out.println(l);
        long arr[]=new long[n+1];
        long brr[]=new long[n+1];
        arr[0]=0;
        for (int i=1;i<=n;i++) {
            long a=in.nextInt();
            arr[i] = arr[i - 1] + a;
        }
        for (int i=l;i<=n;i++)
        {
            brr[i]=arr[i]-arr[i-l];
        }
        long max=Long.MIN_VALUE;
        for (int i=0;i<=n;i++)
        {
            System.out.print(brr[i]+" ");
            if (brr[i]>max)
                max=brr[i];
        }

        System.out.println(max);
    }
}
