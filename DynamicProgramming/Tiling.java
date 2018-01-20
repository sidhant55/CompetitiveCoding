package DynamicProgramming;

import java.util.*;

public class Tiling
{
    static int tile(int n)
    {
        if (n==0)
            return 1;
        if (n<0)
            return 0;
        return ((tile(n-2))+(tile(n-1)));
    }
    public static void main(String args[])
    {
        int n=4;
        System.out.println(tile(n));
    }
}
