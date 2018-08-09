package Codevita;

import java.util.*;

public class FindingSum {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String x=in.nextLine();
        String temp1[]=x.split("\\s*,\\s*");
        long n=Long.parseLong(temp1[0]);
        long p=Long.parseLong(temp1[1]);
        x=in.nextLine();
        String temp2[]=x.split("\\s*,\\s*");

        long arr[]=new long[temp2.length];
        for (int i=0;i<temp2.length;i++)
            arr[i]=Long.parseLong(temp2[i]);

        int c=0;

        for (int i=0;i<arr.length-2;i++)
        {
            for (int j=i+1;j<arr.length-1;j++)
            {
                for (int k=j+1;k<arr.length;k++)
                {
                    long su=arr[i]+arr[j]+arr[k];
                    if (su%p==0)
                        c++;
                }
            }
        }
        System.out.println(c%1009);

    }
}
