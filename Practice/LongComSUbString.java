import java.util.*;
 
class LongComSUbString
{
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        String x="OldSite:GeeksforGeeks.org";
        String y="NewSite:GeeksQuiz.com";

        int l1=x.length();
        int l2=y.length();
        int arr[][]=new int [l1+1][l2+1];
        int max=0;

        for (int i=1;i<=l1;i++)
        {
        	for (int j=1;j<l2;j++)
        	{
        		if (x.charAt(i-1)==y.charAt(j-1))
        			arr[i][j]=1+arr[i-1][j-1];
        		if (arr[i][j]>max)
        			max=arr[i][j];
        	}
        }
        // for (int i=1;i<=l1;i++)
        // {
        // 	for (int j=1;j<l2;j++)
        // 		System.out.print(arr[i][j]+" ");
        // 	System.out.println();
        // }
        System.out.println(max);
    }
}