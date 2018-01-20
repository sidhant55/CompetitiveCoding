package Euler;

import java.util.*;

public class SmallMult {
    static long gcd(long a, long b)
    {
        if (a==0)
            return b;
        return gcd((b%a),a);
    }
    public static void main(String args[]) {
        long result=1;
        long prod=1;
        for (long i=2;i<=20;i++)
        {
            prod=prod*i;
            result=(result*i)/(gcd(result,i));
        }
        System.out.println((result));
    }
}
