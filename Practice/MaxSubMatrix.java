import java.io.*;
class MaxSubMatrix
{
	public static void main(String args[])
	{
		int M[][] =  {{0, 1, 1, 0, 1}, 
                      {1, 1, 0, 1, 0}, 
                      {0, 1, 1, 1, 0},
                      {1, 1, 1, 1, 0},
                      {1, 1, 1, 1, 1},
                      {0, 0, 0, 0, 0}};

        int l1=M.length;
        int l2=M[0].length;
        for (int i=1;i<l1;i++)
        {
        	for (int j=1;j<l2;j++)
        	{
        		if(M[i][j]==1 && M[i-1][j]!=0 && M[i][j-1]!=0 && M[i-1][j-1]!=0)
        			M[i][j]=M[i-1][j-1]+1;
        	}
        }
        for (int i=0;i<l1;i++)
        {
        	for (int j=0;j<l2;j++)
        		System.out.print(M[i][j]+" ");
        	System.out.println();
        }
	}
}