package Euler;

import java.util.*;

public class SumSqr {
    public static void main(String args[]) {
        long sum=0;
        long sq1=0;
        for (int i=1;i<=100;i++)
        {
            sq1=sq1+(long) Math.pow(i,2);
            sum=sum+i;
        }
        long sq2=(long)Math.pow(sum,2);
        System.out.println((sq2-sq1));
    }
}
