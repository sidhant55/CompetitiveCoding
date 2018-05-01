import java.util.*;
 
class MaxSumIncSeq
{
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        int arr[]={1, 101, 2, 3, 100, 4, 110};
        int n=arr.length
        int msis[]=new int [n];
        msis[0]=arr;
        for (int i=1;i<n;i++)
        {
            for (int j=0;j<i;j++)
            {
                if (arr[i]>arr[j] && msis[i]<msis[j]+arr[i])
                    msis[i]=msis[j]+arr[i]
            }
        }
        int max=0;
        for ( i = 0; i < n; i++ )
            if ( max < msis[i] )
                max = msis[i];
        System.out.println(max);
    }
}