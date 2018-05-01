package Practice;

import java.util.*;

public class test1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int arr[]=new int [t];
        for (int i=0;i<t;i++)
            arr[i]=in.nextInt();

        for (int f : arr)
            System.out.println(f);
    }
}
