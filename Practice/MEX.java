package Codechef;

import java.util.*;

public class MEX {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int n=in.nextInt();
            int k=in.nextInt();
            int arr[]=new int [n];
            for (int i=0;i<n;i++)
            arr[i]=in.nextInt();
            Arrays.sort(arr);
            ArrayList<Integer> ar=new ArrayList <Integer>();
            int curr=arr[0];
            ar.add(curr);
            for (int i=1;i<n;i++)
            {
                if (curr==arr[i])
                    continue;
                else
                {
                    ar.add(arr[i]);
                    curr=arr[i];
                }
            }
            //System.out.println(ar);
            int flag=0,i=0;
            for (int ind=0;ind<ar.size();ind+=0) {
                if (i == ar.get(ind))
                    ind++;
                else {
                    if (k != 0) {
                        k--;
                    }
                    else {
                        System.out.println(i);
                        flag = 1;
                        break;
                    }
                }
                i++;
            }
            if (flag==0) {
                int ans=ar.get(ar.size()-1)+k+1;
                System.out.println((ans));
            }
        }
    }
}
