package CodeJam;

import java.util.*;

public class Number_Guessing {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        int t=Integer.parseInt(s1);
        while (--t >= 0) {
            String s2=in.nextLine();
            String s[]=new String [2];
            s=s2.split(" ");
            long a = Long.parseLong(s[0]);
            long b = Long.parseLong(s[1])+1;
            String s3=in.nextLine();
            long n = Long.parseLong(s3);

            int c=0;
            while (a <= b) {
                c=c+1;
                if (c>n)
                    break;
                long mid = (a + b) / 2;

                System.out.println(mid);

                String x=in.nextLine();

                if (x.equals("CORRECT"))
                    break;
                else if (x.equals("TOO_BIG"))
                {
                    b=mid;
                }
                else if (x.equals("TOO_SMALL"))
                {
                    a=mid;
                }
                else
                    break;
            }
        }
    }
}