import java.util.*;
public class television
{
	public static void main (String args[])
	{
		Scanner in=new Scanner (System.in);
		int a=in.nextInt();
		long ar1[]=new long [a];
		long ar2[]=new long [a];
		for (int i=0;i<a;i++)
		{
			ar1[i]=in.nextLong();
			ar2[i]=in.nextLong();
		}
		int flag=0;
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		for (int i=0;i<a-1;i++)
		{
			if (ar1[i+1]<ar2[i])
			{
				flag=1;
				System.out.println("NO");
				break;
			}
		}
		if (flag==0)
		System.out.println("YES");
	}
}