package Euler;

import java.util.*;

public class LetterCount {
    public static void main(String args[]) {
        int unit[]={4,3,3,5,4,4,3,5,5,4,3,6,6,8,8,7,7,9,8,8,6};
        int tenth[]={0,3,6,6,5,5,5,7,6,6,7};
        int s1=0,s2=0,sum1=0;
        for (int i=1;i<10;i++)
        {
            sum1=sum1+unit[i];
        }
        for (int i=1;i<20;i++)
        {
            s1=s1+unit[i];
        }
        for (int i=2;i<10;i++)
        {
            s2=s2+tenth[i]*10+sum1;
        }
    }
}
