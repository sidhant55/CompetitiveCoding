import java.io.*;
class LongIncSubseq
{
	public static void main(String args[])
	{
		int arr[]={10,22,9,33,21,50,41,60};
    int l=arr.length;
    int lis[]=new int [l];
    for (int i=0;i<l;i++)
      lis[i]=1;
    for (int i=1;i<l;i++)
    {
      for (int j=0;j<i;j++)
      {
        if (arr[i]>arr[j])
          lis[i]=Math.max(lis[i], lis[j]+1);
      }
    }
    for (int i=0;i<l;i++)
      System.out.println(lis[i]);
	}
}