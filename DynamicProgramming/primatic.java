package DynamicProgramming;

import java.util.*;

public class primatic {
    static boolean[] sieveOfEratosthenes(int n) {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i < n; i++)
            prime[i] = true;

        prime[0] = false;
        prime[1] = false;

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
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        boolean prime[]=sieveOfEratosthenes(10000);
        int dp[]=new int [10000+1];
        ArrayList<Integer> al=new ArrayList<Integer>();
        for (int i=0;i<=10000;i++)
        {
            if ((prime[i]==true)|| i==4||i==27||i==3125) {
                al.add(i);
                dp[i]=1;
            }
        }
        int max=0;
        while (--t >= 0) {
            int n=in.nextInt();
            if (n<=max)
                System.out.println(dp[n]);
            else {
                for (int i = max + 1; i <= n; i++) {
                    if (dp[i] != 1) {
                        int min = Integer.MAX_VALUE;
                        for (int j = 0; j < al.size(); j++) {
                            if ((i - al.get(j)) >= 2)
                                min = Math.min(min, dp[i - al.get(j)] + 1);
                        }
                        dp[i] = min;
                    }
                    if (i > max)
                        max = i;
                }
                System.out.println(dp[n]);
            }
        }
    }
}
