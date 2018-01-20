package DynamicProgramming;

import java.util.*;

public class SubArrSunSeq {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int n=in.nextInt();
            int arr[]=new int [n];
            int brr[]=new int [n];
            long sum1=0;
            long sum2=arr[0];
            long min=Long.MIN_VALUE;
            long max=Long.MIN_VALUE;
            int flag=0;
            for (int i=0;i<n;i++)
            {
                arr[i]=in.nextInt();
                sum1+=arr[i];
                if (sum1>max)
                    max=sum1;
                if (sum1<0)
                    sum1=0;

                if (arr[i]>0) {
                    sum2 += arr[i];
                    flag=1;
                }
                if (arr[i]>min && arr[i]<0)
                    min=arr[i];
            }
            System.out.println(flag);
            if (flag==0)
            System.out.println(max+" "+min);
            else
                System.out.println(max+" "+sum2);
        }
    }
}
