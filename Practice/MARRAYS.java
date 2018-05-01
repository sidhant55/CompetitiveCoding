package Codechef;

import java.util.*;

public class MARRAYS {
    static int ans[][]=new int[2000000][2];
    static int n;
    static int calc(int a[][],int d,int i, int j)
    {
        if (d>n)
            return 0;
        else if (j>=2||i>=2)
            return 0;
        else if (ans[d-1][i]!=-1)
            return ans[d-1][i];
        else
        {
            int x=calc(a,d+1,(j+1)%2,0);
            int y=calc(a,d,i,j+1);
            ans[d-1][i]=Math.max(Math.abs(a[d-1][i]-a[d][j])*(d-1)+x,y);
            return ans[d-1][i];
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            n=in.nextInt();
            int val[][]=new int [n+1][2];
            ans[0][1]=-1;
            ans[0][0]=-1;
            for (int i=1;i<=n;i++)
            {
                int num=in.nextInt();
                ans[i][0]=-1;
                ans[i][1]=-1;
                val[0][1]=0;
                val[0][0]=0;
                int max=0;
                int min=Integer.MAX_VALUE;
                for (int j=1;j<=num;j++)
                {
                    int mn=in.nextInt();
                    if (mn>max)
                        max=mn;
                    if (mn<min)
                        min=mn;
                }
                val[i][0]=min;
                val[i][1]=max;
            }
            int ret=calc(val,1,0,0);
            for (int i=0;i<n;i++)
                System.out.println(ans[i][0]+" "+ans[i][1]);
            System.out.println(ret);
        }
    }
}
