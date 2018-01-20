package CodeForces;

import java.util.*;

public class Garden {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int l=in.nextInt();
        int arr[]=new int [n];
        for (int i=0;i<n;i++)
            arr[i]=in.nextInt();
        Arrays.sort(arr);
        int flag=0;
        for (int i=n-1;i>=0;i--)
        {
            if (l%arr[i]==0) {
                System.out.println(l / arr[i]);
                flag = 1;
                break;
            }
        }
    }
}
