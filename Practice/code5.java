import java.util.*;
public class code5
{
	public static void main(String args[])throws java.lang.Exception
	{
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		int q=in.nextInt();
		long arr[]=new long [n];
		for (int i=0;i<n;i++)
			arr[i]=in.nextLong();
		for (int i=1;i<=q;i++)
		{
			int opt=in.nextInt();
			if (opt==1)
			{
				int index=in.nextInt()-1;
				int jump=in.nextInt();
				int temp=index,c=0;
				for (int j=index;j<n-1;j++)
				{
					if (arr[temp]<arr[j+1])
					{
						c++;
						//System.out.println(arr[temp]+" "+arr[j+1]+" "+c+" "+jump);
						temp=j+1;
						
					}
					if (c==jump)
					{
						System.out.println(j+2);
						break;
					}
					//System.out.println(c+"2");
				}
			}
			else if (opt==2)
			{
				int l=in.nextInt()-1;
				int r=in.nextInt()-1;
				long x=in.nextLong();
				for (int j=l;j<=r;j++)
				{
					arr[j]=arr[j]+x;
				}
				// for (int j=0;j<n;j++)
				// 	System.out.print(arr[j]+" ");
			}
		}
	}
}