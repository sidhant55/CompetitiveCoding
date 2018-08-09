package Codevita;

import java.util.*;

public class Base6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String x=in.next();

        String temp2[]=x.split("\\s*,\\s*");

        int arr[]=new int[temp2.length];
        for (int i=0;i<temp2.length;i++)
            arr[i]=Integer.parseInt(temp2[i]);

        int brr[]=new int[temp2.length];
        int l=temp2.length;

        int crr[]=new int [l];

        for (int i=0;i<l;i++)
        {
            int tmp=arr[i];
            int val=0;
            while(tmp>0)
            {
                int rem=tmp%6;

                val=val+rem;
                tmp=tmp/6;
            }
            brr[i]=val;
        }

        int c=0;

//        for (int i=0;i<l;i++)
//            System.out.println(brr[i]+" ");
        for (int i=0;i<l-1;i++)
        {
            for (int j=i+1;j<l;j++)
            {
                if(brr[i]>brr[j])
                    c++;
            }
        }
        System.out.println(c);

    }
}
