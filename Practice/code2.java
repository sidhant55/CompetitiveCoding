
import java.util.*;
public class code2
{
	static boolean prime[] = new boolean[1000001];
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
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int count=0;
		int count2=0;
		sieve(1000000);
		for (int i=1;i<=1000000;i++)
		{
			if (i==1)
				hm.put(i,count);
			else
			{
				//int a=isprime(i);
				if (prime[i]==true && i!=0 && i!=1)
				{
					count++;
				}
				//int b=isprime(count);
				if (prime[count]==true && count!=0 && count!=1) 
					count2++;
				hm.put(i,count2);
			}

		}
		// for (int i=1;i<=20;i++)
		// 	System.out.println(i+" "+hm.get(i));
		while (--t>=0)
		{
			int counter=0;
			int a=in.nextInt();
			int b=in.nextInt();
			//System.out.println(d-c);
		
		    int d=hm.get(a-1);
		    int e=hm.get(b);
		    System.out.println(e-d);
		}
	}
}