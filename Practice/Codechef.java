import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in=new Scanner (System.in);
        System.out.println("welcome");
        int  t=in.nextInt();
        while (--t>=0)
        {
            String y=in.next();
            int l=y.length();
            int c1=0,c2=0;
            for (int i=0;i<l;i++)
            {
                if (y.charAt(i)=='m')
                c1++;
                else
                c2++;
            }
            y='a'+y+'a';
            System.out.println(c1+" "+c2);
            StringBuilder x = new StringBuilder(y);
            for (int i=1;i<=l;i++)
            {
                char ch1=x.charAt(1);
                int f=0;
                if (x.charAt(i)=='m'&&x.charAt(i-1)=='s')
                if (ch1=='s')
                {
                    int l1=i-1;
                    x=x.setCharAt(l1,a);
                    c2--;
                    f=1;
                }
                if (x.charAt(i)=='m'&&x.charAt(i+1)=='s'&& f==0)
                {
                    c2--;
                    x=x.setCharAt(i+1,'*');
                }
                
            }
            if (c1>c2)
            System.out.println("mongooses"+c1+c2);
            else if (c1==c2)
            System.out.println("tie"+c1+c2);
            else if (c1<c2)
            System.out.println("snakes"+c1+c2);
        }
    }
}