package CodeForces;

import java.util.*;

public class perfect1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        long val=k*10;
        int flag=0;
        while (flag==0) {
                long var = val;
                int sum = 0;
                while (var > 0) {
                    sum += var % 10;
                    var = var / 10;
                }
                System.out.println(sum);
                if (sum == 10) {
                    flag=1;
                    System.out.println(val+" "+var);
                    break;
            }
            val++;
        }
    }
}
