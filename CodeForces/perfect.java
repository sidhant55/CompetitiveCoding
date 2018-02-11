package CodeForces;

import java.util.*;

public class perfect {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int arr[]=new int [t];
        for (int i=0;i<t;i++)
            arr[i]=in.nextInt();
        Arrays.sort(arr);
        for (int i=t-1;i>=0;i--)
        {
            double t1=Math.pow(arr[i],0.5);
            int t2=(int)Math.pow(arr[i],0.5);
            if (t1!=t2) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
