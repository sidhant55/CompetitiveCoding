package DynamicProgramming;

import java.util.*;

public class LongIncSub {
    public static void main(String args[]) {
        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int brr[]=new int [arr.length];
        int l = arr.length;
        for (int i=0;i<l;i++)
            brr[i]=arr[i];
        for (int i = 1; i < l; i++) {

            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && arr[i]+brr[j] > brr[i])
                {
                    brr[i] = arr[i] + brr[j];
//                    for (int k=0;k<l;k++)
//                        System.out.print(brr[k]+" "+arr[k]+"  ");
//                    System.out.println();
                }

            }
//            for (int j=0;j<l;j++)
//                System.out.print(brr[j]+" ");
//            System.out.println();
        }
//        for (int i=0;i<l;i++)
//        System.out.println(brr[i]);
        System.out.println(brr[l-1]);
    }
}
