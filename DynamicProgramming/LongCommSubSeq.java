package DynamicProgramming;

import java.util.*;

public class LongCommSubSeq {
    public static void main(String args[]) {
        String x="AGGTAB";
        String y="GXTXAYB";
        int l1=x.length();
        int l2=y.length();
        int arr[][]=new int [l1+1][l2+1];
        for (int i=1;i<=x.length();i++)
        {
            for (int j=1;j<=y.length();j++)
            {
                if (x.charAt(i-1)==y.charAt(j-1))
                {
                    arr[i][j]=arr[i-1][j-1]+1;
                }
                else
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
            }
        }
        System.out.println(arr[l1][l2]);
    }
}
