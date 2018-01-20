package DynamicProgramming;

import java.util.*;

public class BinSeqSameSum {
    static int BinSum(int n,int dif)
    {
        if (Math.abs(dif)>n)
            return 0;
        if (n==1 && dif==0)
            return 2;
        if (n==1 && (Math.abs(dif)==1))
            return 1;
        return 2*BinSum(n-1, dif)+BinSum(n-1,dif-1)+BinSum(n-1,dif+1);
    }
    public static void main(String args[]) {
        int n=5;
        System.out.println(BinSum(n,0));
    }
}
