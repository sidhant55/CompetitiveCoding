package Rough;

import java.util.*;

public class Solution {

    public static int gcd(int a,int b)
    {
        if (a==0)
            return b;
        return gcd(b%a,a);
    }

    public static int solve(String[] A) {

        int l=A.length;
        int arr[]=new int [l];

        for (int i=0;i<l;i++)
        {
            StringBuilder str=new StringBuilder(A[i]);
            int len=A[i].length();
            str.append(str);

            for (int k=0;k<len;k++)
            {
                String x=str.substring(k+1,k+len+1);
                //System.out.println(x);
                if (x.equals(A[i])) {
                    arr[i] = k+1;
                    break;
                }
            }
            //System.out.println(arr[i]);
        }

        int max=Integer.MIN_VALUE;

        for (int i=1;i<l;i++)
        {
            if (arr[i]>max)
                max=arr[i];
        }

        int sum=1;
        int i=1;
        while(sum%max!=0)
        {
            i++;
            sum=sum+i;
            System.out.println(sum+" "+i);
        }

        return i;

    }

    public static void main(String args[]) {


        String arr[]={"a","ababa","aba"};

        System.out.println( solve(arr));
    }
}
