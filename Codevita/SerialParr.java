package Codevita;

import java.util.*;

public class SerialParr {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double a=in.nextDouble();
        double x=in.nextDouble();

        double b=in.nextDouble();
        double y=in.nextDouble();


        double z1=b*y;
        double z2=(z1-100)/(b-1);

        double p=100-z2;

        String str1=Double.toString(z2)+"0000";
        String str2=Double.toString(p)+"000";

        int l1=str1.length();

        String st="";
        for(int i=0;i<l1;i++)
        {
            char ch=str1.charAt(i);
            if(ch=='.')
            {
                st=str1.substring(0,i+3);
            }

        }
        int l2=str2.length();
        String st1="";
        for(int i=0;i<l2;i++)
        {
            char ch=str2.charAt(i);
            if(ch=='.')
            {
                st1=str2.substring(0,i+3);
            }

        }

        System.out.println(st+" "+st1);
    }
}
