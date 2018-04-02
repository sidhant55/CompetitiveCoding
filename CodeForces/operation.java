package CodeForces;

import java.util.*;

public class operation {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String x=in.next();
        String ans=""+x.charAt(0);
        int c=1;
        for (int i=1;i<n;i++)
        {
            int l=ans.length();
            try {
                if (ans.equals(x.substring(i, i + l))) {

                    ans = ans + ans;
                    i = i + l-1;
                    c++;
                } else {
                    ans = ans + x.charAt(i);
                    c++;
                }
            }
            catch (Exception e)
            {
                ans = ans + x.charAt(i);
                c++;
            }
        }
        System.out.println(c);

    }
}
