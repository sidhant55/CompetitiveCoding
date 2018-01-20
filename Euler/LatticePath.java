package Euler;

import java.util.*;

public class LatticePath {
    static int find(int a,int b)
    {
        if (a==0 || b==0)
            return 1;
        else
            return find(a-1,b)+find(a,b-1);
    }
    public static void main(String args[]) {
        long arr[][]=new long[21][21];
        for (int i=0;i<21;i++) {
            arr[0][i] = 1;
            arr[i][0]=1;
        }
        for (int i=1;i<21;i++)
        {
            for (int j=1;j<21;j++)
            {
                arr[i][j]=arr[i][j-1]+arr[i-1][j];
            }
        }
        System.out.println(arr[20][20]);

    }
}
