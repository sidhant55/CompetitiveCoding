package CodeForces;

import java.util.*;

public class packets {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long ans=0;
        long sum=1;
        for(int i=1;i<=n;i++)
        {
            if((sum<<1)>n)
                break;
            sum=sum<<1;
            System.out.println(sum);
            ans++;
        }
        if(sum==n)
        System.out.println(ans);
        else
            System.out.println(ans+1);
    }
}
