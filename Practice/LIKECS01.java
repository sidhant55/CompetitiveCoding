package Codechef;

import java.util.*;

public class LIKECS01 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            String x=in.next();
            int l=x.length();
            int flag=0;
            for (int i=97;i<=122;i++)
            {
                char ch=(char)i;
                int c=0;
                for (int j=0;j<x.length();j++)
                {
                    if (ch==x.charAt(j))
                        c++;
                }
                if (c>=2)
                {
                    flag=1;
                    break;
                }
            }
            if (flag==0)
                System.out.println("no");
            else
                System.out.println("yes");
        }
    }
}
