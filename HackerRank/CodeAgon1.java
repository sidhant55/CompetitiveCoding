package HackerRank;

import java.util.*;

public class CodeAgon1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String x=in.next();
        int k=in.nextInt();
        int arr[]=new int [26];
        for (int i=97;i<=122;i++)
        {
            int c=0;
            char ch=(char)i;
            for (int j=0;j<x.length();j++)
            {
                if (x.charAt(j)==ch)
                    c++;
            }
                arr[i-97]=c;
        }
        String y="";
        for (int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            int a=(int)ch-97;
            if (arr[a]>=k)
            {
                y=y+ch;
            }
        }
        System.out.println(y);
    }
}
