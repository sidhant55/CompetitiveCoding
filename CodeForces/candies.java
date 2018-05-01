package CodeForces;

import java.util.*;

public class candies {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long n=in.nextLong();
        long k=in.nextLong();
        long m=in.nextLong();
        long d=in.nextLong();

        long max=0;
        for (long i = d; i > 0; i--) {
            if((double)k*(i-1)+1 > 2*n)continue;
            long temp = (k * (i - 1) + 1);

            long x=n/temp;

            x=Math.min(x,m);
            max=Math.max(x*i,max);

        }
        System.out.println(max);

    }
}
