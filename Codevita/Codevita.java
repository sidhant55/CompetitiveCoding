
package Codevita;
import Placement.INORDER;

import java.util.*;
import java.io.*;
import java.math.BigInteger;



class Codevita {


    public static void main(String args[])throws IOException {


        Scanner in=new Scanner(System.in);

        String x=in.next();
        String temp1[]=x.split("\\s*,\\s*");
        int n=Integer.parseInt(temp1[0]);
        int p=Integer.parseInt(temp1[1]);
        int q=Integer.parseInt(temp1[2]);

        String y=in.next();
        String temp2[]=y.split("\\s*,\\s*");
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(temp2[i]);
        }

        int c1=0,c2=0,c3=0;

        for (int i=0;i<n;i++)
        {
            if (arr[i]%p==0)
                c1++;
            if (arr[i]%q==0)
                c2++;
            if (arr[i]%p==0 && arr[i]%q==0)
                c3++;
        }



    }
}
