package Rough;

import java.util.*;
import java.io.*;

class box
{
    long a;
    box(long a)
    {
        this.a=a;
    }

    public static long firstDigit(long n)
    {
        long digits = (long)Math.log10(n);
        n = (long)(n / Math.pow(10, digits));
        return n;
    }
    public static long lastDigit(long n)
    {
        return (n % 10);
    }

    public static Comparator<box> comp(){
        Comparator<box> cmp=new Comparator<box>(){
            @Override
            public int compare(box s1,box s2)
            {
                long num1=s1.a;
                long num2=s2.a;

                if (num1==num2)
                    return 0;
                while(firstDigit(num1)==firstDigit(num2))
                {
                    try
                    {
                        long digits = (long)Math.log10(num1);
                        long n = (long)(num1% Math.pow(10, digits));
                        num1=num1/((n+1)*digits);
                        System.out.println(digits+" "+n+" "+num1);
                    }
                    catch(java.lang.Exception e)
                    {
                        num1=0;
                        return (-1);
                    }

                    try
                    {
                        long digits = (long)Math.log10(num2);
                        long n = (long)(num2 % Math.pow(10, digits));
                        num2=num2/((n+1)*digits);
                        System.out.println(digits+" "+n+" "+num1);
                    }
                    catch(java.lang.Exception e)
                    {
                        num2=0;
                        return(1);
                    }
//                    System.out.println(s1.a+" "+num1+"   "+s2.a+" "+num2);
                }
                if (firstDigit(num1)>firstDigit(num2))
                    return 1;
                else if (firstDigit(num1)<firstDigit(num2))
                    return -1;
                else
                    return 0;
            }
        };
        return cmp;
    }
}


public class interviewbit1 {

    public static String largestNumber(final List<Integer> A) {

        ArrayList<box> arr=new ArrayList<>();
        int l=A.size();
        for(int i=0;i<l;i++)
        {
            box obj=new box(A.get(i));
            arr.add(obj);
        }

        Collections.sort(arr,box.comp());

//        System.out.println(arr);

        StringBuilder x=new StringBuilder();
        for (int i=l-1;i>=0;i--)
            x.append(arr.get(i).a);


        return x.toString();
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
//        arr.add(815);
//        arr.add(259);
//        arr.add(77);
//        arr.add(218);
//        arr.add(731);
//        arr.add(992);
//        arr.add(304);
//        arr.add(769);
//        arr.add(962);
//        arr.add(454);

        arr.add(3);
        arr.add(30);
        arr.add(34);
        arr.add(5);arr.add(9);


        System.out.println(largestNumber(arr));
    }
}
