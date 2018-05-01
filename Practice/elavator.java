/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class elavator
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner (System.in);
		int t=in.nextInt();
		while (--t>=0)
		{
		    Double n =in.nextDouble();
		    Double v1=in.nextDouble();
		    Double v2=in.nextDouble();
		    
		    Double t1=(n*Math.sqrt(2))/v1;
		    Double t2=(n*2)/v2;
		    if (t1<=t2)
		    	System.out.println("Stairs");
		    else
		    	System.out.println("Elevator");
		}
		
	}
}
