package Codechef;

import java.util.*;

public class TASHIFT1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String x=in.next();
        String y=in.next();
        int lsp[]=new int [n];
        int i=1;
        int len=0;
        lsp[0]=0;
        while (i<n)
        {
            if (x.charAt(i)==x.charAt(len))
            {
                len++;
                lsp[i]=len;
                i++;
            }
            else
            {
                if (len!=0)
                {
                    len=lsp[len-1];
                }
                else
                {
                    lsp[i]=len;
                    i++;
                }
            }
        }
        i=0;
        int j=0,max=0,index=0;
        y=y+y;
        while (i<2*n)
        {
            if (x.charAt(j)==y.charAt(i))
            {
                i++;
                j++;
            }
            if (j>max)
            {
                max=j;
                index=i-j;
            }
            else if (i<2*n && x.charAt(j)!=y.charAt(i))
            {
                if (j!=0)
                    j=lsp[j-1];
                else
                    i=i+1;
            }
        }
        System.out.print(index);
    }
}
