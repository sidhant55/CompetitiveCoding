import java.util.*;
public class ticket
{
	public static void main (String args[])
	{
		Scanner in=new Scanner (System.in);
		String x=in.next();
		int s1=0,s2=0,c1=0,c2=0;
		int ar1[]=new int [3];
		int ar2[]=new int [3];
		int max1=3,max2=3;
		for (int i=0;i<6;i++)
		{
			if (i<3)
			{
				ar1[c1]=Character.getNumericValue(x.charAt(i));
				s1=s1+ar1[c1];
				c1++;
			}
			else
			{
				ar2[c2]=Character.getNumericValue(x.charAt(i));
				s2=s2+ar2[c2];
				c2++;
			}
		}
		int dif=s1-s2,sum=0;
		//System.out.println(dif);
		if (dif==0)
			System.out.println(0);
		else if (dif>0)
		{
			sum=s2;
			Arrays.sort(ar2);
			for (int i=0;i<3;i++)
			{
				sum+=9-ar2[i];
				if (sum>=s1)
				{
					max1=i+1;
					break;
				}
			}
			sum=s1;
			for (int i=2;i>=0;i--)
			{
				sum-=ar1[i];
				if (sum<=s2)
				{
					max2=3-i;
					break;
				}
			}
			System.out.println(Math.min(max1,max2));
		}
		else if (dif<0)
		{
			sum=s1;
			//System.out.println(s2);
			Arrays.sort(ar1);
			for (int i=0;i<3;i++)
			{
				sum+=9-ar1[i];
				//System.out.println(sum);
				if (sum>=s2)
				{
					max1=i+1;
					break;
				}
			}
			sum=s2;
			for (int i=2;i>=0;i--)
			{
				sum-=ar2[i];
				//System.out.println(sum);
				if (sum<=s1)
				{
					max2=3-i;
					break;
				}
			}
			System.out.println(Math.min(max1,max2));
		}
	}	
}