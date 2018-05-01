package Codechef;

import java.util.*;

public class KAN13C {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String x=in.next();
            if (x.equals("End"))
                break;
            else {
                int l = x.length();
                int arr[] = new int[l];
                arr[0] = 0;
                int i = 1;
                int len = 0;
                while (i < l) {
                    if (x.charAt(i) == x.charAt(len)) {
                        len++;
                        arr[i] = len;
                        i++;
                    } else {
                        if (len != 0) {
                            len = arr[len - 1];
                        } else {
                            arr[i] = len;
                            i++;
                        }
                    }
                }
                for (int j = 0; j < l; j++)
                    System.out.print(arr[j] + " ");
                System.out.println();
            }
        }
    }
}
