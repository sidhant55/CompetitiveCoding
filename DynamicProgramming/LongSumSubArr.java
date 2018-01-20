package DynamicProgramming;

import java.util.*;

public class LongSumSubArr {
    public static void main(String args[]) {
        int arr[]={-2, -3, -4, -10, -2, -10, -5, -3};
        int l=arr.length;
        int sum=0,max=Integer.MIN_VALUE;
        for (int i=0;i<l;i++)
        {
            sum+=arr[i];
            if (sum>max)
                max=sum;
            if (sum<0)
                sum=0;
        }
        System.out.println(max);
    }
}
