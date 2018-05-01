package Codechef;

import java.util.*;

public class SEACO2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int n=in.nextInt();
            int m=in.nextInt();
            int arr[][]=new int [m+1][n];
            int ans[]=new int [n];
            for (int i=1;i<=m;i++)
            {
                int a=in.nextInt();
                int b=in.nextInt()-1;
                int c=in.nextInt()-1;
                if (a==1)
                {
                    for (int j=b;j<=c;j++)
                    {
                        arr[i][j]=arr[i-1][j]+1;
                    }
                }
                else
                {
                    if (i==(c+2))
                        for (int j = 0; j < n; j++) {
                            arr[i][j] = arr[i-1][j] * 2 - arr[b][j];
//                            if (i==7)
//                            {
//                                System.out.println(c+1+" "+j+" "+arr[c + 1][j]+" "+arr[b][j]+" "+arr[i][j]);
//                            }

                        }

                    else
                    {
                        for (int j = 0; j < n; j++)
                        arr[i][j] = (arr[i - 1][j]- arr[c][j])*2-arr[b][j];
//                        System.out.println(i-1+" "+c);
                    }
                }


//                System.out.println(" "+i);
            }
            for (int j=0;j<n;j++)
            {
                System.out.print(arr[m][j]+" ");
            }

        }
    }
}
