package Euler;

import java.util.*;

public class Collatz {
    public static void main(String args[]) {
        int max=0;
        int arr[]=new int [1000000];
        arr[0]=0;
        arr[1]=1;
        long ans=0;
        for (int i=2;i<1000000;i++)
        {

            int c=0,c1=0;
            long num=i;
            while (num!=1)
            {
                c++;
                if (num%2==0) {
                    num = num / 2;
                }
                else {
                    num = 3 * num + 1;
                }
                if (num<i) {
                    c = c + arr[(int)num];
                    break;
                }
            }
            arr[i]=c;
            if (c>max)
            {
                max=c;
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
