package Euler;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;

public class HighPrime {
    static long prime(long n)
    {
        long max=0;
        while (n%2==0)
        {
            System.out.println("2 ");
            max=2;
            n=n/2;
        }
        int count=(int)Math.sqrt(n)+1;
        for (int i=3;i<= count;i+=2)
        {
//            if(i>6857)
//                System.out.println("yes");
            while (n%i==0)
            {
                System.out.println(i+" ");
                max=i;
                n/=i;
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        long l=600851475143l;
        System.out.println(prime(l));

    }
}
