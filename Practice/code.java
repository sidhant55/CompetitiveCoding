import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class node
{
    int data;
    node next;
}
public class code
{
    static int check(String s, int p)
    {
        //System.out.print(p+"  ");
        for (int i=0;i<s.length();i++)
        {
            //System.out.print(s.charAt(i)+" ");
            if (Character.getNumericValue(s.charAt(i))==p)
            {
                return 1;
            }
        }
        return 0;
    }
	public static void main (String args[]) 
	{
		Scanner in=new Scanner (System.in);
		System.out.println();
		int t=in.nextInt();
		while (--t>=0)
		{
		    int flag=0;
		    int n=in.nextInt();
		    int k=in.nextInt();
		    node a[]=new node[n];
		    String s="";
		    for (int i=0;i<n;i++)
		    {
		        a[i]=new node();
		        a[i].next=null;
		        node b=a[i];
		        int p=in.nextInt();
		        while(--p>=0)
		        {
		            node x=new node();
		            x.data=in.nextInt();
		            x.next=null;
		            b.next=x;
		            b=x;
		        }
		    }
		    int i;
		    for (i=0;i<n;i++)
            {
                node head=a[i];
                while (head!=null)
                {
                    if(check(s,head.data)==0 && head.data!=0)
                    s=s+head.data;
                    head=head.next;
                    if (s.length()==k)
                    {
                        flag=1;
                        break;
                    }
                }
            }
            if (flag==1 && i==n-1)
            System.out.println("ALL");
            else if (flag==1 && i<n-1)
            System.out.println("Some");
            else if (flag==0)
            System.out.println("sad");
		}
		
	}
}
