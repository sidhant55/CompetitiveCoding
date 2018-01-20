package CodeForces;

import java.util.*;

public class cursor {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int pos=in.nextInt();
        int l=in.nextInt();
        int r=in.nextInt();
        if (l==1 && r==n)
            System.out.println(0);
        else if (l==1)
        {
            System.out.println(Math.abs(r-pos)+1);
        }
        else if (r==n)
            System.out.println(Math.abs(pos-l)+1);
        else
            if (pos>=l && pos<=r)
            System.out.println(Math.min(pos-l+r-l, r-pos+r-l)+2);
            else if (pos<l)
            {
                System.out.println(r-pos+2);
            }
            else
                System.out.println(pos-l+2);
    }
}
