
import java.util.*;
 
class Dpcatlan
{
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        int l=5+1;
        
        int arr[]=new int [l];
        arr[0]=1;
        for (int i=1;i<l;i++)
        {
            int sum=0;
            for (int j=0;j<i;j++)
                sum+=arr[j]*arr[i-j-1];
            arr[i]=sum;
        }
        for (int i=0;i<l;i++)
        System.out.println(arr[i]);
    }
}