package Codechef;

import java.util.*;
import java.lang.*;

class CHEFSUM
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in=new Scanner (System.in);
        int t=in.nextInt();
        while (--t>=0)
        {
            int n=in.nextInt();
            long arr[]=new long [n+1];
            arr[0]=0;
            for (int i=1;i<=n;i++)
            {
                long a=in.nextLong();
                arr[i]=arr[i-1]+a;
                //System.out.print(arr[i]+" ");
            }
            //System.out.println();
            long min=Long.MAX_VALUE,sum=0;
            int flag=0;
            for (int i=1;i<=n;i++)
            {
                sum=arr[i]+(arr[n]-arr[i-1]);
                if (sum<min)
                {
                    min=sum;
                    flag=i;
                }
                //System.out.println(arr[i]+" "+(arr[n]-arr[i-1])+"  ");
            }
            System.out.println(flag);
        }

    }
}


