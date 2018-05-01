import java.io.*;
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
public class Jam1B
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
        while (t>r)
        {
            r++;
            double d=in.nextDouble();
            int n=in.nextInt();
            double arr[]=new double [n];
            for (int i=0;i<n;i++)
            {
                double d1=(d-in.nextDouble());
                double s1=in.nextDouble();
                arr[i]=d1/s1;
                System.out.println(arr[i]);
            }
            double max=0;
            for (int i=0;i<n;i++)
            {
                if (arr[i]>max)
                max=arr[i];
            }
            double m=d/max;
            System.out.println("Case #"+r+": "+m);
            double f=(double)(296123110-178048654)/(double)7489;
            System.out.println(f);
        }
            output.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.printf("Error:%s\n",ex);
        }
    }
}  