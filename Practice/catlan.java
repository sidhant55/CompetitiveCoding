import java.util.*;
 
class catlan
{
    /* Driver program to test above functions */
    static int cat(int n)
    {
        if (n<=1)
            return 1;
        int sum=0;
        for (int i=0;i<n;i++)
        sum+= cat(i)*cat(n-i-1);

        return sum;

    }
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        int n=5;
        System.out.println(cat(n));
    }
}