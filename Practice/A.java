import java.io.*;
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
public class A
{
    public static void main (String args[])
    {
        System.out.println("Welcome");
        File file=new File("test.txt");
        File file1=new File("testout.txt");
        
        System.out.println("Welcome");
        try
        {
            Scanner in=new Scanner (file);
            PrintWriter output=new PrintWriter(file1);
            int t=in.nextInt();
            for (int u=1;u<=t;u++){
            int r=in.nextInt();
            int d=in.nextInt();
            String a[]=new String [r];
            for (int i=0;i<r;i++)
            {
                a[i]=in.next();
            }
            int st=0,c=0;
            String y="";
            char ch=' ';
            String z="";
            int arr[]=new int [r];
            for (int i=0;i<r;i++)
            {
                for (int j=0;j<d;j++)
                {
                    if (a[i].charAt(j)!='?')
                    {
                        ch=a[i].charAt(j);
                        break;
                    }
                }
                if (ch==' ')
                {
                    arr[c]=i;
                    c++;
                }
                else{
                for (int j=0;j<d;j++)
                {
                    if (a[i].charAt(j)=='?')
                    y=y+ch;
                    else
                    {
                        
                        y=y+a[i].charAt(j);
                        ch=a[i].charAt(j);
                    }
                }
                z=y;
                a[i]=y;
                y="";
            }
            ch=' ';
        }
        if (c>0)
        {
            for (int i=0;i<c;i++)
            {
                int temp=arr[i];
                if (temp==0)
                a[0]=z;
                if (temp==r-1)
                a[r-1]=z;
                else
                a[temp]=z;
            }
        }
        output.println("Case #"+u+": ");
            for (int i=0;i<r;i++)
            {
                output.println(a[i]);
            }
            
        }
        output.close();
    }
        catch (FileNotFoundException ex)
        {
            System.out.printf("Error:%s\n",ex);
        }
    }
}  