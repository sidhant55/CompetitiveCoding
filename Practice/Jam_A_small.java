import java.util.*;
public class Jam_A_small
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Welcome");
        int t=in.nextInt();
        int r=0;
        while(r<t)
        {
            r++;
            String s=in.next();
            int k=in.nextInt();
            int l=s.length();
            int c=0;
            for (int i=0;i<l-k+1;i++)
            {
                if (s.charAt(i)=='-')
                {
                    c++;
                    for (int j=i;j<i+k;j++)
                    {
                        
                        if (s.charAt(j)=='-')
                            s=s.substring(0,j)+'+'+s.substring(j+1);
                        else 
                            s=s.substring(0,j)+'-'+s.substring(j+1);
                    }
                }
            }
            int d=0;
            for (int i=0;i<l;i++)
            {
                if (s.charAt(i)=='+')
                d++;
            }
            if (d==l)
            System.out.println("Case #"+(r)+": "+c);
            else
            System.out.println("Case #"+(r)+": IMPOSSIBLE");
        }
    }
}