/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class code4
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in=new Scanner (System.in);
        int t=in.nextInt();
        while (--t>=0)
        {
            HashMap<String,Integer> a =new HashMap<String, Integer>();
            int n=in.nextInt();
            String x="";
            int count=1,flag=0;
            for (int i=0;i<n;i++)
            {
                int temp=in.nextInt();
                x=x+temp.toString();
            }
            a.put(x,count);
            a.put("111000",2);
            a.put(x,count);
            a.put("001100",3);
            a.put(x,count);
            a.put("02354",4);

            Set<Map.Entry<String, Integer>> set=a.entrySet();

            for (Map.Entry<String, Integer> me:set)
            {
                if (flag==1)
                    a.put("10101010",5);
                System.out.println(me.getKey()+":"+me.getValue());
            }

            
        }
    }
}
