package DynamicProgramming;

import java.util.*;

public class LinSoln {
    static int count(int arr[],int rhs)
    {
        if (rhs<0)
            return 0;
        if (rhs==0)
            return 1;
        int res=0;
        for (int i=0;i<arr.length;i++)
        {
            res+= count(arr,arr[i]-rhs);
        }
        return res;
    }
    public static void main(String args[]) {
        int arr[]={2,2,3};
        int rhs=4;
        System.out.println(count(arr,rhs));
    }
}
