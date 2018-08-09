package Codevita;

import java.util.*;

public class CountBit {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        String x=in.nextLine();
        String temp2[]=x.split("\\s*,\\s*");

        int arr[]=new int[temp2.length];
        for (int i=0;i<temp2.length;i++)
            arr[i]=Integer.parseInt(temp2[i]);

        int cnt[]=new int [temp2.length];

        for (int i=0;i<temp2.length;i++)
        {
            cnt[i]=Integer.bitCount(arr[i]);
//            System.out.println(cnt[i]+" ");
        }

        long c=0;
        for (int i=0;i<cnt.length-1;i++)
        {
            for (int j=i+1;j<cnt.length;j++)
            {
                if (cnt[i]>cnt[j])
                    c++;
            }
        }
        System.out.println(c);

    }
}
