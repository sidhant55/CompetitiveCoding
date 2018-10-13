package HackerRank;

import java.util.*;

public class Fiipping {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String arr[]=new String[t];
        int ma=0;
        for(int i=0;i<t;i++) {
            arr[i]=in.next();
            int l=arr[i].length();
            if(l>ma)
                ma=l;
        }
        long or=0;
        for(int i=0;i<t;i++) {
            int l=arr[i].length();
            for(int j=l;j<ma;j++)
                arr[i]=arr[i]+'0';
            or=or|Long.parseLong(arr[i],2);
        }

        String x=Long.toBinaryString(or);
        int l=x.length();
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(x.charAt(i)=='1');
            c++;
        }
        if(c%2==0)

            System.out.println('B');
        else
            System.out.println('A');
        System.out.println(c);
    }
}
