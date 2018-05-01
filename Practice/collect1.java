import java.util.*;
public class collect1
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        TreeSet<Integer> al=new TreeSet<Integer>();
        for (int i=0;i<20;i++)
        {
            al.add(i%7);
        }
        System.out.println("O/P"+al);
        for (int i=0;i<20;i=i+2)
        {
            try{al.remove(i);}
            catch(IndexOutOfBoundsException ae)
            {
                System.out.print("error"+i+" ");
            }
        }
        System.out.println("O/P"+al);
    }
}