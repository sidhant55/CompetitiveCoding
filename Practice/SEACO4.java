package Codechef;

import java.util.*;
class node
{
    int type;
    int l;
    int r;
}

class SEACO4 {

    static long[] constructBITree(long arr[],int n)
    {
        long BIT[]=new long [n+1];
        for (int i=1;i<=n;i++)
            BIT[i]=0;
        for (int i=0; i<n; i++)
            updateBIT(BIT, n, i, arr[i]);
        return BIT;
    }

    static void updateBIT(long BIT[], int n, int index, long val)
    {
        index = index + 1;
        while (index <= n)
        {
            BIT[index] = (BIT[index]+val);
            index += index & (-index);
        }
    }

    static long getSum(long BIT[], int index)
    {
        long sum = 0;
        index = index + 1;
        while (index>0)
        {
            sum =(sum+ BIT[index]);
            index -= index & (-index);
        }
        return sum;
    }
    static void update(long BIT[], int l, int r, int n, long val)
    {
        updateBIT(BIT, n, l, val);
        updateBIT(BIT, n, r+1, -val);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int n=in.nextInt();
            int m=in.nextInt();

            long arr[]=new long [m];
            for (int i=0;i<m;i++)
                arr[i]=0;

            long btree1[] = constructBITree(arr,m);
            update(btree1, 0, m-1, m, 1);

            long crr[]=new long [n];
            long btree2[]=constructBITree(crr,n);

            node brr[]=new node [m];

            for (int i=0;i<m;i++)
            {
                node ob=new node();
                ob.type=in.nextInt();
                ob.r=in.nextInt()-1;
                ob.l=in.nextInt()-1;
                brr[i]=ob;
            }


            for (int i=m-1;i>=0;i--)
            {
                if (brr[i].type==2) {
                    long a=getSum(btree1,i);
                    update(btree1, brr[i].r, brr[i].l, m, a);
                }
                else
                {
                    long a=getSum(btree1,i);
                    update(btree2, brr[i].r, brr[i].l, n, a);
                }
            }

            for (int i=0;i<n;i++)
            {
                System.out.print(getSum(btree2,i)%1000000007+" ");
            }
            System.out.println();
        }
    }
}