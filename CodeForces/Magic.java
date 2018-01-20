package CodeForces;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;

public class Magic {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        char ch=s2.charAt(0);
        String ans=""+s1.charAt(0);
        for (int i=1;i<s1.length();i++)
        {
            if ((int)s1.charAt(i)>=(int)ch)
                break;
            ans=ans+s1.charAt(i);
        }
        ans=ans+ch;
        System.out.println(ans);
    }
}