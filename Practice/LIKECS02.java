package Codechef;

import java.util.*;

public class LIKECS02 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int n=in.nextInt();
            int div=(n/2)+1;
            for (int i=div;i<(div+n);i++)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
