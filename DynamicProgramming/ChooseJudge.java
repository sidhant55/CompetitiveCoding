package DynamicProgramming;

import java.util.*;

public class ChooseJudge {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int l=1;l<=t;l++) {
            int n=in.nextInt();
            long arr[]=new long[n];
            long brr[]=new long[n];
            for (int i=0;i<n;i++)
                arr[i]=in.nextLong();
            if (n==1)
            {
                System.out.println("Case "+l+": "+arr[0]);
                continue;
            }
            if (n==2) {
                System.out.println("Case "+l+": "+Math.max(arr[0], arr[1]));
                continue;
            }
            brr[0]=arr[0];
            brr[1]=arr[1];
            for (int i=2;i<n;i++)
            {
                for (int j=0;j<i-1;j++)
                {
//                    System.out.print(brr[i]+" "+(arr[i]+brr[j])+"  ");
                    brr[i]=Math.max(brr[i], arr[i]+brr[j]);
                }
//                System.out.println();
            }
//            for (int i=0;i<n;i++)
//                System.out.print(brr[i]+" ");
//            System.out.println();
            System.out.println("Case "+l+": "+Math.max(brr[n-2],brr[n-1]));
        }
    }
}
