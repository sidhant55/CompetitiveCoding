package HackerRank;

import java.util.*;

public class CodeAgon2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int n=in.nextInt();
            long arr[]=new long [n];
            long brr[]=new long [n];
            for (int i=0;i<n;i++) {
                arr[i] = in.nextLong();
                brr[i]=arr[i];
            }
            Arrays.sort(arr);
            int flag=0;
            for (int i=0;i<n;i++)
            {
                if (arr[i]!=i+1)
                {
                    flag=1;
                    break;
                }
            }
            int c=0;
            for (int i=0;i<n;i++)
            {
                if (arr[i]==brr[i])
                    c++;
            }
            if (c==n)
                flag=1;
            if (flag==0)
                System.out.println("Beautiful");
            else
                System.out.println("Ugly");
        }
    }
}
