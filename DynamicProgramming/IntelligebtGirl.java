package DynamicProgramming;

import java.util.*;

public class IntelligebtGirl {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String x=in.next();
        int l=x.length();
        int arr[]=new int [l+1];
        arr[l]=0;
        for (int i=l-1;i>=0;i--)
        {
            int a=Character.getNumericValue(x.charAt(i));
            if (a%2==0)
            arr[i]=arr[i+1]+1;
            else
                arr[i]=arr[i+1];
        }
        for (int i=0;i<l;i++)
            System.out.print(arr[i]+" ");
    }
}
