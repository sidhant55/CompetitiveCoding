package Codechef;

import java.util.*;

public class PERFCONT {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int n=in.nextInt();
            int p=in.nextInt();
            int arr[]=new int [n];
            for (int i=0;i<n;i++)
                arr[i]=in.nextInt();
            int hard=p/10;
            int cake=p/2;
            int c1=0,c2=0;
            for (int i=0;i<n;i++)
            {
                if (arr[i]>=cake)
                    c1++;
                if (arr[i]<=hard)
                    c2++;
            }
            if (c1==1 && c2==2)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
