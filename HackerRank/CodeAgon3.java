package HackerRank;

import java.util.*;

public class CodeAgon3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int k=in.nextInt();
        int arr[]=new int [n];
        int start=0, end=0;
        for (int i=0;i<n;i++) {
            arr[i] = in.nextInt();
            if (arr[i]==1 && start==0)
                start=i;
            if (arr[i]==1)
                end=i;
        }
        long min=Long.MAX_VALUE;
        for (int i=start;i<=end;i++)
        {
            long cost=0;
            int c=0;
            int ind=i;
            if (arr[i]==1) {
                for (int j = i; j <= end; j++) {
                    if (arr[j] == 1&& c==0) {
                        c++;
                        cost+=i;
                        ind=j;
                    }
                    else if (arr[j] == 1) {

                        cost+=(j-ind)*c*k;
                        c++;
                        ind=j;
                    }
                    //System.out.print(cost+" ");
                    if (c==m)
                        break;

                }
                if (cost<min && c==m)
                    min=cost;
                if (c<m)
                    break;
            }
            //System.out.println();
        }
        System.out.println(min);
    }
}
