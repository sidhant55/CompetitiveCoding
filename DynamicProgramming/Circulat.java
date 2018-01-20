package DynamicProgramming;


import java.util.*;

public class Circulat {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int mod = (int) (1e9 + 9);
        int t = in.nextInt();
        int limit = (int) 1e7;

        long arr[]=new long [limit+1];
        arr[0]=0;
        arr[1]=1;
        int count=1;
        while (--t >= 0) {
            int a=in.nextInt();

            //System.out.println(a);
            if (a>count) {
                for (int i = 2; i <= a; i++) {
                    arr[i] = (arr[i - 2] + 4 * (long) i * (long) i - 6 * ((long) i - 1)) % mod;
                }
                count=a;
            }
//            for (int i=0;i<=a;i++)
            System.out.println(arr[a]);
        }
    }
}
