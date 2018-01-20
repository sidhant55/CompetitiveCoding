package CodeForces;

import java.util.*;

public class Ralph {
    static int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0 || b == 0)
            return 0;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        int ar[]=new int[1001];
        for (int i=0;i<n;i++)
            arr[i]=in.nextInt();
        for (int i=0;i<n;i++)
        {
            for (int j=i;j<n;j++)
            {
                ar[(gcd(arr[i],arr[j]))]=1;
            }
        }
        int flag=0;
        int count=0;
        for (int i=0;i<1001;i++)
            if (ar[i]==1)
                count++;
        for (int i=0;i<n;i++)
        {
            if (ar[arr[i]]!=1) {
                flag = 1;
                break;
            }
        }
        if (flag==1 || count!=n)
            System.out.println(-1);
        else
        {
            ArrayList<Integer> ans=new ArrayList <Integer>();
            for (int i=0;i<=1000;i++)
            {
                if (ar[i]==1)
                    ans.add(i);
            }
            System.out.println(ans.size());
            for (int i=0;i<ans.size();i++)
                System.out.print(ans.get(i)+" ");
        }
    }
}
