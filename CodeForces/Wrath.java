package CodeForces;

import java.util.*;

public class Wrath {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];
        int ar[]=new int [n];
        ar[n-1]=1;
        for (int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int count=0;
        int ch=n-1;
        for (int i=n-1;i>=0;i--) {
            if (i<ch) {
                ar[i] = 1;
                ch = i;
            }
            if (i - arr[i] <= ch)
                ch = i - arr[i];
        }
        for (int i=0;i<n;i++)
        {
            if (ar[i]==1)
                count++;
        }
        System.out.println(count);
    }
}
