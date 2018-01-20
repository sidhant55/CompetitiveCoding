package Euler;

import java.util.*;

public class SUmprime {
    static boolean[] sieveOfEratosthenes(int n) {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i < n; i++)
            prime[i] = true;
        prime[0]=false;
        prime[1]=false;
        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p] == true) {
                // Update all multiples of p
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        return prime;
    }
    public static void main(String args[]) {
        boolean prime[]=sieveOfEratosthenes((2000000-1));
        long s=0;
        for (int i=0;i<(2000000);i++)
        {
            if (prime[i])
                s=s+i;
        }
        System.out.println(s);
    }
}
