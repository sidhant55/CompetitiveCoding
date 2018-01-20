package DynamicProgramming;

import java.util.*;
class a
{
    int x=0;
    int y=0;
    int z=0;
}

public class Shopping1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int n=in.nextInt();
            a arr[]=new a [n];
            for (int i=0;i<n;i++)
            {
                a obj=new a();
                obj.x=in.nextInt();
                obj.y=in.nextInt();
                obj.z=in.nextInt();
                arr[i]=obj;
            }
            int out1[]=new int [n];
            int out2[]=new int [n];
            int out3[]=new int [n];
            for (int i=0;i<n;i++)
            {
                //out1[i]=Math.min()
            }
        }
    }
}
