import java.io.*;
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
public class Inversion
{
    public static void main (String args[])
    {
        System.out.println("Welcome");
        File file=new File("coursera.txt");
        /*try{
        PrintWriter output=new PrintWriter(file);
        output.println("Sidhant");
        output.println(42);
        output.close();
        }
        catch(IOException ex){
            System.out.printf("Error:%s\n",ex);
        }*/
        long a[]=new long [100000];
        try{
        Scanner in=new Scanner (file);

        for (int i=0;i<100000;i++){
            a[i]=in.nextLong();
        }
        }
        catch (FileNotFoundException ex){
            System.out.printf("Error:%s\n",ex);
        }
        long n=100000;
        long sum=0;
        long s=0;
        for (int j=0;j<n;j++)
        {
            int i;
            for (i=0;i<n;i++)
            {
                if (a[i]==j+1)
                {
                    s=s+Math.abs(i-j);
                    break;
                }
            }
            //System.out.print("Index of 1 2... "+i+" ");
            for (int k=i;k>j;k--)
            {
                a[k]=a[k-1];
            }
            a[j]=(j+1);
        }
        System.out.println(s);

    }
}
        