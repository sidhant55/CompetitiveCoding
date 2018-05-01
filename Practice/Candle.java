/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Candle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner (System.in);
		long t=in.nextLong();
		while (--t>=0)
		{
		    double k=in.nextDouble();
		    double a=in.nextDouble();
		    double b=in.nextDouble();
		    double n=k-2;
		    double dif=Math.abs(a-b);
		    dif=dif-1;
		    long ans=(long)Math.min(dif,n-dif);
		    if (dif!=n-dif)
		    	System.out.println(ans);
		    else
		    	System.out.println(0);
		}
		
	}
}
