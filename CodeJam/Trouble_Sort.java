package CodeJam;

import java.util.*;

public class Trouble_Sort {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int cas=1;cas<=t;cas++) {
            int n=in.nextInt();
            long arr[]=new long [n];
            long brr1[]=new long [(n/2)];
            long brr2[]=new long [(n/2)+(n%2)];
            System.out.println();
            int c1=0,c2=0;
            for (int i=0;i<n;i++)
            {
                arr[i]=in.nextLong();
                if (i%2!=0)
                {
                    brr1[c1]=arr[i];
                    c1++;
                }
                else
                {

                    brr2[c2]=arr[i];
                    c2++;
                }
            }

            Arrays.sort(arr);
            Arrays.sort(brr1);
            Arrays.sort(brr2);

            c1=0;
            c2=0;
            int flag=0;
            for (int i=0;i<n;i++)
            {
                if (i%2!=0)
                {
                    if (arr[i]==brr1[c1])
                    {
                        c1++;
                    }
                    else
                    {
                        flag=1;
                        System.out.println("Case #"+cas+": "+i);
                        break;
                    }
                }
                else
                {
                    if (arr[i]==brr2[c2])
                    {
                        c2++;
                    }
                    else
                    {
                        flag=1;
                        System.out.println("Case #"+cas+": "+i);
                        break;
                    }
                }

            }
            if (flag==0)
                System.out.println("Case #"+cas+": OK");

        }
    }
}
