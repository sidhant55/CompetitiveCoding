package CodeForces;

import java.util.*;

public class diff {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String a=in.next()+"0";
        String b=in.next()+"0";

        int c=0;
        for(int i=0;i<n;i++)
        {
            char ch1=a.charAt(i);
            char ch2=b.charAt(i);

            if(ch1==ch2)
                continue;
            else
            {
                if(a.charAt(i+1)!=b.charAt(i+1) && a.charAt(i+1)==ch2) {
                    c++;
                    i++;
                }
                else
                {
                    c++;
                }

            }
        }
        System.out.println(c);

    }
}
