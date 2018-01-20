package Rough;

import java.util.*;

public class oct {
    public static void main(String[] str) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("here you go");
        int p = sc.nextInt();
        int n = sc.nextInt();
        int[] np = new int[p];
        for(int i = 0; i < p; i++){

            np[i] = sc.nextInt();
            System.out.println("the input is : "  +np[i]);
            if(np[i] > n){
                throw new IndexOutOfBoundsException();
            }

        }
        for(int i = 0; i < p; i++){
            System.out.println(np[i]);
        }
        Arrays.sort(np);
        for(int i = 0; i < p; i++){
            System.out.println(np[i]);
        }
    }

}