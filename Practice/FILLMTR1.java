package Codechef;

import java.util.*;

public class FILLMTR1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int n = in.nextInt();
            int arr[][] = new int[n][n];
            int brr[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                {
                    if (i==j)
                        arr[i][j]=0;
                    else
                    arr[i][j] = -1;
                }

            }
            int flag = 0;
            int q = in.nextInt();
            for (int i = 0; i < q; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                int c = in.nextInt();
                arr[a][b] = c;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][i] == 1) {
                        flag = 1;
                        break;
                    } else if ((arr[i][j] == 1 && arr[j][i] == 0) || (arr[i][j] == 0 && arr[j][i] == 1)) {
                        flag = 1;
                        break;
                    } else if ((arr[i][j] == 1 && arr[j][i] == -1) || (arr[i][j] == 0 && arr[j][i] == -1)) {
                        arr[j][i] = arr[i][j];
                    }
                }
            }
            int c=0;
            if (flag==1)
                System.out.println("no");
            else {
                int no;
                for (int i = 0; i < n-1; i++) {
                    if (i==0)
                        no=0;
                    else {
                        no = brr[i - 1][i];
                        brr[i][i]=no;
                    }
                    for (int j = i+1; j < n; j++)
                        {
                            if (arr[i][j]==1) {
                                brr[i][j] = no + 1;
                                no++;
                            }
                            else if (arr[i][j]==0)
                                brr[i][j]=no;
                            else
                                brr[i][j]=-1;
                            //System.out.print(i+" "+j+" "+no);
                        }
                    }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++)
                        System.out.print(arr[i][j]+" ");
                        System.out.println();
                }
                for (int i=1;i<n;i++)
                {
                    int c1=0;
                    for (int j=0;j<i;j++)
                    {
                        if (brr[i][j]%2==0 && brr[i][j]!=-1)
                            c1++;
                    }
                    if (c1==0 || c1==i+1)
                        flag=0;
                    else
                    {
                        flag=1;
                        break;
                    }
                }
                if (flag==0)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }

        }
    }
}