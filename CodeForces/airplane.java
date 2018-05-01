package CodeForces;

import java.util.*;

public class airplane {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int k=in.nextInt();
        int n=in.nextInt();
        int s=in.nextInt();
        int p=in.nextInt();

        int sheet=n/s;
        if (n%s!=0)
            sheet++;

        int total=sheet*k;

        int ans=total/p;
        if (total%p!=0)
            ans++;

        System.out.println(ans);
    }
}
