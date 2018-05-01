import java.util.*;
 
class MaxLenChain
{
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        int arr[][] = {{5,24},{15, 25},{27, 40},{50, 60}};
        int l=arr.length;
        int mlc[]=new int [l];
        for (int i=0;i<l;i++)
            mlc[i]=1;
        for (int i=1;i<l;i++)
        {
            for (int j=0;j<i;j++)
            {
                if (arr[i][0]>arr[j][1] && mlc[i]<mlc[j]+1)
                    mlc[i]=mlc[j]+1;
            }
        }
        int max=0;
        for (int i=1;i<l;i++)
        {
            if (mlc[i]>max)
                max=mlc[i];
        }
        System.out.println(max);
    }
}