package CodeForces;

import java.util.*;

public class strng {
    public static int check(String x)
    {
        int l=x.length();

        int f1=0,f2=0,f3=0;
        for(int i=0;i<l;i++)
        {
            int asc=(int)x.charAt(i);
            if(asc>=97 && asc<=122)
                f1=1;
            if(asc>=65 && asc<=90)
                f2=1;
            if(asc>=48 && asc<=57)
                f3=1;
        }
        if(f1==1 && f2==1 && f3==1)
            return 0;
        else if (f1==0 && f2==1 && f3==1)
            return 1;
        else if (f1==1 && f2==0 && f3==1)
            return 2;
        else if (f1==1 && f2==1 && f3==0)
            return 3;
        else if (f1==0 && f2==0 && f3==1)
            return 4;
        else if (f1==0 && f2==1 && f3==0)
            return 5;
        else if (f1==1 && f2==0 && f3==0)
            return 6;
        else
            return 7;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {

            String x=in.next();

            int flag=check(x);

            if(flag==0)
                System.out.println(x);
            else if(flag==7)
            {
                System.out.print("aA1"+x.substring(3));
            }
            else if(flag==1)
            {
                System.out.print("a"+x.substring(1));
            }
            else if(flag==2)
            {
                System.out.print("A"+x.substring(1));
            }
            else if(flag==3)
            {
                System.out.print("1"+x.substring(1));
            }

        }
    }
}
