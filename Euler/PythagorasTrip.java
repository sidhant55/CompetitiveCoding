package Euler;

import java.util.*;

public class PythagorasTrip {
    public static void main(String args[]) {
        double i=0;
        double ans1;
        int ans2;
        for (int c=1;c<=1000;c++)
        {
            for (int b=1;b<c;b++)
            {
                for (int a=1;a<b;a++)
                {
                    if (a+b+c>1000)
                        break;
                    double x=a*a+b*b;
                    double y=c*c;
                    if (a+b+c==1000 && x==y)
                    {
                        System.out.println(a*b*c);
                    }
                }
            }
        }
    }
}
