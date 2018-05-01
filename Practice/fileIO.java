import java.io.*;
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
public class fileIO
{
    public static void main (String args[])
    {
        System.out.println("Welcome");
        File file=new File("test.txt");
        try{
        PrintWriter output=new PrintWriter(file);
        output.println("Sidhant");
        output.println(42);
        output.close();
        }
        catch(IOException ex){
            System.out.printf("Error:%s\n",ex);
        }
        Scanner in=new Scanner (file);
        int t=in.nextInt();
        String x="";
        int age=0;
        try{
        

        x=in.nextLine();
        age=in.nextInt();
        }
        catch (FileNotFoundException ex){
            System.out.printf("Error:%s\n",ex);
        }
        System.out.println(x+" "+age);
        }

    }

        