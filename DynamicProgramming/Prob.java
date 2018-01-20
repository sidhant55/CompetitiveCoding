package DynamicProgramming;

import java.text.DecimalFormat;
import java.util.*;

public class Prob {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int a=in.nextInt();
            int b=in.nextInt();
            double arr[][]=new double [a+1][b+1];
            for (int i=0;i<=a;i++)
            {
                for (int j=0;j<=b;j++)
                {
                    if (i==0){arr[i][j]=1;continue;}
                    if (j==0){arr[i][j]=1;continue;}
                    if (j==1)
                        arr[i][j]=((i*1.0)/(i+j));
                    else
                        arr[i][j]=((i*1.0)/(i+j))+((j*1.0)/(i+j))*((j-1)*1.0/(i+j-1))*arr[i][j-2];
                }
            }
            DecimalFormat numberFormat = new DecimalFormat("0.000000");
            System.out.println(numberFormat.format(arr[a][b]));
        }
    }
}
