/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Multiplication_64bit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner (System.in);
		System.out.println("Welcome");
		int n=in.nextInt();
		String x=in.next();
		String y=in.next();
		int a[][]=new int [n][2*n-1];
		int c=0;
		for (int i=n-1;i>=0;i--)
		{
		    char ch1=x.charAt(i);
		    int n1=Character.getNumericValue(ch1);
		    int rem=0;
		    c=i;
		    for (int j=n-1;j>=0;j--)
		    {
		        char ch2=y.charAt(j);
		        int n2=Character.getNumericValue(ch2);
		        int r=(n1*n2);
		        int p=(r+rem)%10;
		        
		        if(j==0)
		        a[i][c+j]=n1*n2+rem;
		        else
		        a[i][c+j]=p;
		        //System.out.print(a[i][c+j]+" ");
		        rem=(n1*n2+rem)/10;
		    }
		    //System.out.println();
		}
		/*for (int i=0;i<5;i++)
		{
		    for (int j=0;j<9;j++)
		    System.out.print(a[i][j]);
		    System.out.println();
		}*/
		int rem=0,sum=0,k=0;
		String z="";
		for (int i=2*n-2;i>=0;i--)
		{
		    for (int j=n-1;j>=0;j--)
		    {
		        sum=sum+a[j][i];
		        //System.out.print(a[j][i]);
		    }
		    //System.out.println();
		    if (i==1)
		    z=sum+z;
		    else
		    z=(sum%10)+z;
		    sum=sum/10;
		    k++;
		}
		System.out.println(z);
		//System.out.println(k);
	}
}