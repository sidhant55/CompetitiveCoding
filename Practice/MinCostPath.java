import java.io.*;
class MinCostPath
{
	public static void main(String args[])
	{
		int cost[][]= {{1, 2, 3},
                       {4, 8, 2},
                       {1, 5, 3}};

    int l1=cost.length;
    int l2=cost[0].length;
    

    int m=2, n=2;
    int arr[][]=new int [l1][l2]; 
    arr[0][0]=cost[0][0];
        for (int i = 1; i <l1; i++)
        arr[i][0] = arr[i-1][0] + cost[i][0];

    /* Initialize first row of tc array */
    for (int j = 1; j < l2; j++)
        arr[0][j] = arr[0][j-1] + cost[0][j];

    for (int i=1;i<l1;i++)
    {
      for (int j=1;j<l2;j++)
      {
        arr[i][j]+=Math.min(arr[i-1][j-1],Math.min(arr[i-1][j],arr[i][j-1]))+cost[i][j];
      }
    }



    for (int i=0;i<l1;i++)
    {
      for (int j=0;j<l2;j++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
	}
}