import java.util.*;
class LongestCommonSubsequence
{
	public static void main(String args[])
	{
		String x="AGGTAB";
		String y="GXTXAYB";
		int l1=x.length();
		int l2=y.length();
		int arr[][]=new int [l1+1][l2+1];
		int c=0;
		for (int i=1;i<=l1;i++)
		{
			for (int j=1;j<=l2;j++)
			{
				if (x.charAt(i-1)==y.charAt(j-1))
					arr[i][j]=Math.min(arr[i-1][j],arr[i][j-1])+1;
				else
					arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
			}
		}
		for (int i=0;i<=l1;i++)
		{
			for (int j=0;j<=l2;j++)
				System.out.print(arr[i][j]+" ");
				System.out.println();
			}
		System.out.println(arr[l1][l2]);
	}
}