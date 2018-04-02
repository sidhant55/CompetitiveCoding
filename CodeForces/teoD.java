package CodeForces;

import java.util.*;

public class teoD {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int l=in.nextInt();
        String x=in.next();
        String ans="";
        for (int i=0;i<l;i++)
        {
            try {
                if (x.charAt(i) == 'R' && x.charAt(i + 1) == 'U') {
                    ans = ans + 'D';
                    i++;
                } else if (x.charAt(i) == 'U' && x.charAt(i + 1) == 'R') {
                    ans = ans + 'D';
                    i++;
                }
                else
                    ans=ans+x.charAt(i);
            }
            catch(Exception e)
            {
                ans=ans+x.charAt(i);
            }

        }
        System.out.println(ans.length());
    }
}
