import java.util.*;
public class code1
{
	public static void main(String args[])throws java.lang.Exception
	{
		Scanner in=new Scanner (System.in);
		double n=in.nextDouble();
		double p=in.nextDouble();
		int count=0;
		for (int i=2;i<=n;i++)
		{
			double k=(i*(i-1))*p;
			double l=Math.pow(k,0.5);
			int q=(int)l;
			if (q*(q+1)==k)
				count++;
		}
		System.out.println(count);
	}
}