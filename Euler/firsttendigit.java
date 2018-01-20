package Euler;

import java.math.BigInteger;
import java.util.*;

public class firsttendigit {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        BigInteger arr[]=new BigInteger[100];
        BigInteger sum= BigInteger.valueOf(0);
        for (int i=0;i<100;i++)
        {
            arr[i]=in.nextBigInteger();
            sum=sum.add(arr[i]);
        }
        System.out.println(sum);
    }
}
