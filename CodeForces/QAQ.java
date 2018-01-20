package CodeForces;

import java.util.*;

public class QAQ {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String x=in.next();
        int c=0;
        for (int i=0;i<x.length()-2;i++)
        {
            char ch1=x.charAt(i);
            for (int j=i+1;j<x.length()-1;j++)
            {
                char ch2=x.charAt(j);
                for (int k=j+1;k<x.length();k++)
                {
                    char ch3=x.charAt(k);
                    String y=Character.toString(ch1)+Character.toString(ch2)+Character.toString(ch3);
                    if (y.equals("QAQ"))
                        c++;
                }
            }
        }
        System.out.println(c);
    }
}
