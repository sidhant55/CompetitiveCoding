import java.util.*;
public class code3
{
	static boolean prime[] = new boolean[1501];
	public static void sieve(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        
        for(int i=0;i<n;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
    }
	public static void main(String args[])throws java.lang.Exception
	{
		Scanner in=new Scanner (System.in);
		int t=in.nextInt();
		sieve(1500);
		while (--t>=0)
		{
			String x=in.next();
			int max=2;
			for (int i=0;i<x.length();i++)
			{
				char ch=x.charAt(i);
				int b=(int)ch;
				if (b>=65 && b<=90)
					{
						int a=(int)ch;
						a=a-55;
						if (a>max)
							max=a;
					}
					else
					{
						int a=Character.getNumericValue(ch);
						if (a>max)
							max=a;	
					}
			}
			int flag=0;
			//System.out.println(max);
			for (int i=max+1;i<=36;i++)
			{
				int sum=0;
				int c=0;
				for (int j=x.length()-1;j>=0;j--)
				{
					char ch=x.charAt(j);
					int b=(int)ch;
					if (b>=65 && b<=90)
					{
						int a=(int)ch;
						a=a-55;
						sum=sum+a*(int)Math.pow(i,c);
					}
					else
					{
						int a=Character.getNumericValue(ch);
						sum=sum+a*(int)Math.pow(i,c);
					}
					c++;
				}
				//System.out.println(i+" "+sum);

				if (prime[sum]==true && sum!=0 && sum!=1)
				{
					System.out.print(i+" ");
					flag=1;
				}
			}
			if (flag==0)
				System.out.println("NONE");
			else
			System.out.println();
		}
	}
}