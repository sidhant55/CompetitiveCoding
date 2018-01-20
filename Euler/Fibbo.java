package Euler;

import java.util.*;

public class Fibbo {
    public static void main(String args[]) {
        int a=1,b=2,c=0;
        long s=2;
        while (c<=4000000)
        {
            c=a+b;
            a=b;
            b=c;
            if (c%2==0)
                s=s+c;
        }
        System.out.println(s);
    }
}
