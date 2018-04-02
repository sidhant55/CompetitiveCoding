package CodeForces;

import java.util.*;

public class filled1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n=in.nextInt();
        int arr[]=new int [n];

        int max=0;
        int flag=0;

        for (int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            if (arr[i]<0)
            {
                System.out.println("NO");
                flag=1;
            }
            if (arr[i]>max)
                max=arr[i];
        }


        int val=-1;
        int cnt1=0;
        int cnt2=1;


        if (flag==0) {
            for (int i = 1; i < n; i++) {
                int dif = Math.abs(arr[i] - arr[i - 1]);

                if (dif != 1 && val == -1)
                    val = dif;
                else if (dif == 1 || dif == val) {
                    if (dif == 1)
                        cnt1++;
                    if (dif == val)
                        cnt2++;
                } else {
                    System.out.println("NO");
                    flag = 1;
                    break;
                }

            }
            if (flag==0)
            {
                int x=val;
                int y=0;
                try {
                    y = max / x;
                }
                catch(Exception e)
                {
                    System.out.println("NO");
                    flag = 1;
                }
                if (max%x!=0)
                    y++;
                if (cnt1==n-1 && flag==0)
                {
                    System.out.println("YES");
                    System.out.println(1+" "+n);
                }
                else if (cnt2==n-1&& flag==0)
                {
                    System.out.println("YES");
                    System.out.println(y+" "+x);
                }
                else if (flag==0)
                {
                    for (int i=0;i<n-1;i++)
                    {
                        if (arr[i]%val==0 && arr[i+1]-arr[i]==1)
                        {
                            System.out.println("NO");
                            flag = 1;
                            break;
                        }
                        if ((arr[i]-1)%val==0 && arr[i]-arr[i+1]==1)
                        {
                            System.out.println("NO");
                            flag = 1;
                            break;
                        }
                    }
                    if (flag==0)
                    {
                        System.out.println("YES");
                        System.out.println(y+" "+x);
                    }
                }
            }
        }
    }
}
