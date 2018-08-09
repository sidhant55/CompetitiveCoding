package Codevita;

import java.util.*;

public class NovaCops {

    static long power(long x, long y, long p)
    {
        long res = 1;
        x = x % p;

        while (y > 0)
        {
            if (y % 2 == 1)
                res = (res * x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }

        return res;
    }
    static long modInverse(long n, long p)
    {
        return power(n, p-2, p);
    }

    static long gcd(long a,long b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {

            long I=in.nextLong();
            long D=in.nextLong();
            long Z=in.nextLong();
            long g=gcd(gcd(I,D),Z);
            I=I/g;
            D=D/g;
            Z=Z/g;

            long inv=modInverse(Z,D);

            System.out.println((I*inv)%D);
        }
    }
}
