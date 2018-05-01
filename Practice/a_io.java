import java.io.*;
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
public class a_io
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
        for (int u=1;u<=t;u++)
        {
            output.println(u);        
        }
            output.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.printf("Error:%s\n",ex);
        }
    }
}  