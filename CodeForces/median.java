package CodeForces;

import java.util.*;

public class median {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long arr[]=new long [n];
        long med=in.nextLong();
        for(int i=0;i<n;i++)
            arr[i]=in.nextLong();
        Arrays.sort(arr);



        long val=arr[n/2];


        if(val==med)
            System.out.println(0);
        else if(med>val)
        {
            long ans=0;
            for(int i=n/2;i<n;i++)
            {
                if(arr[i]>=med)
                    break;
                ans=ans+med-arr[i];
            }
            System.out.print(ans);
        }
        else if(med<val)
        {
            long ans=0;
            for(int i=n/2;i>=0;i--)
            {
                if(arr[i]<=med)
                    break;
                ans=ans+arr[i]-med;
            }
            System.out.print(ans);
        }


    }
}
