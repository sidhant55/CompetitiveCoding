package CodeForces;

import java.util.*;

public class conan {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int arr[]=new int [t];
        for (int i=0;i<t;i++)
            arr[i]=in.nextInt();
        Arrays.sort(arr);
//        for (int i = t - 1; i >= 0; i--)
//            System.out.print(arr[i]);
//        System.
        if (arr[t-1]!=arr[t-2])
            System.out.println("Conan");
        else {
            int temp = arr[t - 1];
            int c = 0;
            for (int i = t - 1; i >= 0; i--) {
                if (arr[i] == temp)
                    c++;
            }
            if (c==t && c%2==0)
                System.out.println("Agasa");
            else
                System.out.println("Conan");
        }
    }
}