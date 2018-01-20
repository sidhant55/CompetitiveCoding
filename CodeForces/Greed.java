package CodeForces;

import java.util.*;

public class Greed {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr1[]=new int [n];
        int arr2[]=new int [n];
        for (int i=0;i<n;i++)
            arr1[i]=in.nextInt();
        for (int i=0;i<n;i++)
            arr2[i]=in.nextInt();
        long sum=0;
        for (int i=0;i<n;i++)
        {
            sum=sum+arr1[i];
        }
        int max1=0;
        int max2=0;
        int c=0;
        for (int i=0;i<n;i++)
        {
            if (arr2[i]>=max1) {
                max1 = arr2[i];
            }
        }
        for (int i=0;i<n;i++)
        {
            if (arr2[i]==max1)
                c++;
        }
        if (c>=2)
            max2=max1;
        else {
            for (int i = 0; i < n; i++) {
                if (arr2[i] > max2 && arr2[i]!=max1)
                    max2 = arr2[i];
            }
        }
        if (max1+max2>=sum)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
