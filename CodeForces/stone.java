package CodeForces;

import java.util.*;

public class stone {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int l=in.nextInt();

        int arr[]=new int[w];
        long sum[]=new long [w];
        for(int i=1;i<w;i++)
        {
            arr[i]=in.nextInt();
            sum[i]=sum[i-1]+arr[i];
//            System.out.print(sum[i]+" ");
        }

        int min=Integer.MAX_VALUE;

        for (int i=1;i<(w-l+1);i++)
        {
            if (sum[i+l-1]-sum[i-1]<min)
                min=(int)(sum[i+l-1]-sum[i-1]);
        }

        System.out.println(min);


    }
}
