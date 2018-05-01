import java.io.*;
class LargestSubarrSum
{
	public static void main(String args[])
	{
		int [] arr={-2,-3,-4,-1,-2,-1,-5,-3};
		int l=arr.length;
		int max=Integer.MIN_VALUE,sum=0;
		for (int i=0;i<l;i++)
		{
			sum+=arr[i];
			
			if (max<sum)
				max=sum;
			if (sum<0)
				sum=0;
		}
		System.out.println(max);
	}
}