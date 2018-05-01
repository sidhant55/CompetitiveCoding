import java.io.*;
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
public class submit_B
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
                int x=in.nextInt();
                int num,rem=0,c=9;
                for (int i=x;i>=1;i--)
                {
                    num=i;
                    c=9;
                    while(num>0)
                    {
                        rem=num%10;
                        num=num/10;
                        //System.out.println(rem+" "+num+" "+c);
                        if (rem<=c)
                        c=rem;
                        else{
                            break;
                        }
                        //System.out.println(rem+" "+num+" "+c);
                    }
                    if (num==0 && rem<=c){
                    
                        output.println("Case #"+r+": "+i);
                        break;
                    }
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