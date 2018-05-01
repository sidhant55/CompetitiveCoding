package Codechef;

import java.util.*;

public class CHEFCOUN {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
             int n=in.nextInt();
             long arr[]=new long[n];
             arr[0]=1;
             long sum=(long)(((long)(Math.pow(2,32)-3))/(n-1));
             long left=(long)(((long)(Math.pow(2,32)-3))%(n-1));
             for (int i=1;i<n;i++)
             {
                 arr[i]=sum;
             }
             int i=1;
            while (--left>=0)
            {
                arr[i]=arr[i]+1;
                i++;
            }
            if (left>0)
                arr[n-1]=left;

            for ( i=0;i<n;i++)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
}
