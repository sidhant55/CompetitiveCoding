package CodeForces;

import java.util.*;

public class Permute {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long a=in.nextLong();
        long b=in.nextLong();
        long temp=a;
        int arr[]=new int [10];
        int c=0;
        while (temp>0)
        {
            int rem=(int)(temp%10);
            arr[rem]+=1;
            temp=temp/10;
            c++;
        }
        String x= String.valueOf(b);
        String ans="";
        if (c<x.length())
        {
            for (int i=9;i>=0;i--)
            {
                for (int j=0;j<arr[i];j++)
                    ans=ans+i;

            }
        }

        else
        {
            int index;
            int d=0;
                while(true) {
                    index=(x.charAt(d))-48;
                    for (int i = index; i >= 0; i--) {
                        if (arr[i] != 0) {
                            ans += i;
                            arr[i]--;
                            break;
                        }
                    }
                    if (Long.parseLong( ans)<Long.parseLong(x.substring(0,d+1)))
                    {
                        break;
                    }
                    d++;
                }
                for (int i = 9; i >= 0; i--) {
                    for (int j = 0; j < arr[i]; j++)
                        ans = ans + i;
                }
        }
        System.out.println(Long.parseLong(ans));
    }
}
