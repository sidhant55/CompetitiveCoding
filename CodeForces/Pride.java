package CodeForces;

import java.util.*;

public class Pride {
    static int check(int a, int b)
    {
        if (a == 0)
            return b;
        return check(b%a, a);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int [n];
        int flag=0;
        for (int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            if (arr[i]%2==1)
                flag=1;
        }
        if (flag==1)
        {
            int min=Integer.MAX_VALUE;
            for (int i=0;i<n-1;i++)
            {
                int temp=0;
                int count=0;
                if (arr[i]!=arr[i+1]) {
                    while (temp != 1) {
                        if ((arr[i]>arr[i+1]&& arr[i]/arr[i+1]==0) || (arr[i]<arr[i+1] && arr[i+1]/arr[i]==0)|| arr[i]==arr[i+1])
                        {
                            break;
                        }
                        temp = check(arr[i], arr[i+1]);
                        arr[i+1]=temp;
                        count++;
                    }

                }
                else
                    count=Integer.MAX_VALUE;
                if (count<min)
                    min=count;
            }
            System.out.println(min+n-1);
        }
        else
        {
            System.out.println(-1);
        }
    }
}
