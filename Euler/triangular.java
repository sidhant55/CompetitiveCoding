package Euler;

import java.util.*;

public class triangular {
    static int check(int n)
    {
        int c=0;
        for (int i=1;i<=(int)Math.sqrt(n)+1;i++)
        {
            if (n%i==0)
            {
                if (n/i==i)
                    c++;
                else
                    c+=2;
            }
        }
        return c;
    }
    public static void main(String args[]) {
        int temp=0;
        int i=0;
        while (true)
        {
            temp+=i;
            int c=check(temp);
//            System.out.println(temp+" "+c);
            if( c>500)
            {
                System.out.println(temp);
                break;
            }
            i++;
        }
    }
}
