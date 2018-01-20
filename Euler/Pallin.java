package Euler;

import java.util.*;

public class Pallin {
    public static void main(String args[]) {
        long max=0;
        for (int i=999;i>=100;i--)
        {
            for (int j=999;j>=100;j--)
            {
                long prod=i*j;
                long rev=0;
                while (prod>0)
                {
                    long rem=prod%10;
                    rev=rev*10+rem;
                    prod=prod/10;
                }
                if ((i*j)==rev)
                    max=rev>max?rev:max;
            }
        }
        System.out.println(max);
    }
}
