import java.util.*;
 
class SubSetSum
{
    static boolean SubSum(int a[],int sum, int n)
    {
        if (sum==0)
            return true;
        if (n==0 && sum!=0)
            return false;
        if (a[n-1]>sum)
            return SubSum(a,sum,n-1);

        return (SubSum(a,sum-a[n-1],n-1)|| SubSum(a,sum,n-1));
    }
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        int set[] = {3, 34, 4, 12, 5, 2};
          int sum = 9;
          int n = set.length;
          System.out.println(n);
          if (SubSum(set, sum, n) == true)
             System.out.println("Found a subset with given sum");
          else
             System.out.println("No subset with given sum");
    }
}