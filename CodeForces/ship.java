package CodeForces;

import java.util.*;

public class ship {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();

        char arr[][]=new char [n][n];

        int ans[][]=new int [n][n];

        for (int i=0;i<n;i++) {
            String x=in.next();
            for (int j=0;j<n;j++)
            {
                arr[i][j]=x.charAt(j);
            }
        }

        int max=0;
        int val1=1,val2=1;
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {

                if (j+k-1<n)
                {
                    int flag=0;
                    for (int l=0;l<k;l++)
                    {
                        if (arr[i][j+l]=='#') {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag==0)
                    {
                        for (int l=0;l<k;l++)
                            ans[i][j+l]++;
                    }

                }

                if (i+k-1<n)
                {
                    int flag=0;
                    for (int l=0;l<k;l++)
                    {
                        if (arr[i+l][j]=='#') {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag==0)
                    {
                        for (int l=0;l<k;l++)
                            ans[i+l][j]++;
                    }
                }




            }
        }

        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++) {
                if (ans[i][j]>max)
                {
                    val1=i+1;
                    val2=j+1;
                    max=ans[i][j];
                }
            }
        }

        System.out.println(val1+" "+val2);


    }
}
