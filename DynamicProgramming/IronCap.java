package DynamicProgramming;

import java.util.*;

public class IronCap {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int n=in.nextInt();
            int cst1[]=new int [n];
            int cst2[]=new int [n];
            int chng1[]=new int [n];
            int chng2[]=new int [n];
            for (int i=0;i<n;i++)
                cst1[i]=in.nextInt();
            for (int i=0;i<n;i++)
                cst2[i]=in.nextInt();
            for (int i=1;i<n;i++)
                chng1[i]=in.nextInt();
            for (int i=1;i<n;i++)
                chng2[i]=in.nextInt();
            int dp1[]=new int [n];
            int dp2[]=new int [n];
            dp1[0]=cst1[0];
            dp2[0]=cst2[0];
            for (int i=1;i<n;i++)
            {
                dp1[i]=Math.min(dp1[i-1]+cst1[i],dp2[i-1]+chng2[i]+cst1[i]);
                dp2[i]=Math.min(dp2[i-1]+cst2[i],dp1[i-1]+chng1[i]+cst2[i]);
            }
            System.out.println(Math.min(dp1[n-1],dp2[n-1]));
        }
    }
}
