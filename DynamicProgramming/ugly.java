package DynamicProgramming;

import java.util.*;

public class ugly {
    static int maxno(int a,int b)
    {
        while (a%b==0)
        {
            a=a/b;
        }
        return a;
    }
    static int uglyno(int n)
    {
       n=maxno(n,2);
       System.out.println(n);
       n=maxno(n,3);
       System.out.println(n);
       n=maxno(n,5);
       System.out.println(n);
       return n ==1?1:0;
    }
    public static void main(String args[]) {
        int n=15;
        System.out.println(uglyno(n));
    }
}
