package Codechef;

import java.util.*;

public class CHEFPDIG {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            String x=in.next();
            int l=x.length();
            int arr[]=new int [10];
            for (int i=0;i<l;i++)
            {
                int a=Character.getNumericValue(x.charAt(i));
                arr[a]+=1;
            }
//            for (int i=0;i<10;i++)
//                System.out.print(arr[i]+" ");
//            System.out.println();
            String y="";
            for (int i=65;i<=90;i++)
            {
                int a=i/10;
                int b=i%10;
                if (a==b && arr[a]>=2)
                    y=y+(char)i;
                else if (arr[a]!=0 && arr[b]!=0 && a!=b)
                    y=y+(char)i;
            }
            System.out.println(y);
        }
    }
}
