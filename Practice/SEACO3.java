package Codechef;

import java.util.*;

public class SEACO3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int n=in.nextInt();
            int q=in.nextInt();
            int arr[][]=new int [q+1][n];
            for(int i=1;i<=q;i++)
            {
                int a=in.nextInt();
                int b=in.nextInt()-1;
                int c=in.nextInt()-1;
                if (a==1)
                {
                    for (int j=0;j<n;j++)
                        if (j>=b && j<=c)
                            arr[i][j]=arr[i-1][j]+1;
                        else
                            arr[i][j]=arr[i-1][j];

                }
                if (a==2)
                {
                    for (int j=0;j<n;j++)
                    {
                        arr[i][j]=arr[i-1][j]+arr[c+1][j]-arr[b][j];
                    }
                }

            }
            for (int j=0;j<n;j++)
                System.out.print(arr[q][j]+" ");
            System.out.println();
        }
    }
}
