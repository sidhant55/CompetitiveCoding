package Euler;

import java.math.BigInteger;
import java.util.*;

public class pow {
    public static void main(String args[]) {
        BigInteger a= BigInteger.valueOf(1);
        for (int i=0;i<1000;i++)
        {
            a=a.multiply(BigInteger.valueOf(2));
        }
        String x=a.toString();
        long sum=0;
        for (int i=0;i<x.length();i++)
        {
            sum=sum+Character.getNumericValue(x.charAt(i));
        }
        System.out.println(sum+" "+x.length());
    }
}
