import java.io.*;
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
public class submit_A
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
            int r=0;
            while(r<t)
            {
                r++;
                String s=in.next();
                int k=in.nextInt();
                int l=s.length();
                int c=0;
                for (int i=0;i<l-k+1;i++)
                {
                    if (s.charAt(i)=='-')
                    {
                        c++;
                        for (int j=i;j<i+k;j++)
                        {
                        
                            if (s.charAt(j)=='-')
                                s=s.substring(0,j)+'+'+s.substring(j+1);
                            else 
                                s=s.substring(0,j)+'-'+s.substring(j+1);
                        }   
                    }
                }
                int d=0;
                for (int i=0;i<l;i++)
                {
                    if (s.charAt(i)=='+')
                    d++;
                }
                    
                if (d==l)
                    output.println("Case #"+(r)+": "+c);
                else
                    output.println("Case #"+(r)+": IMPOSSIBLE");    
            }
            output.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.printf("Error:%s\n",ex);
        }
    }
}  