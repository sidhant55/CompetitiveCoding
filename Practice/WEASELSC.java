package Codechef;

import java.util.*;

public class WEASELSC {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int a=in.nextInt();
            int b=in.nextInt();
            int arr[]=new int [a];
            for (int i=0;i<a;i++)
                arr[i]=in.nextInt();
            Arrays.sort(arr);
            System.out.println(arr[0]*a);
        }
    }
}
