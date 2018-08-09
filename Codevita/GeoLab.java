package Codevita;

import java.util.*;

public class GeoLab {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int q=in.nextInt();

        long arr[]=new long [n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextLong();

        long brr[]=new long [1001];

        Arrays.sort(arr);
        int st=0;
        for(int i=1;i<=1000;i++)
        {

            long c=0;
            for(int j=st;j<n;j++)
            {
                if(arr[j]==i)
                    c++;
                else
                {
                    st=j;
                    break;
                }
            }
            brr[i]=c+brr[i-1];
        }

//        for(int i=0;i<20;i++)
//        {
//            System.out.print(brr[i]+" ");
//        }

        ArrayList<Long> ans=new ArrayList <>();
        for(int i=0;i<q;i++)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            ans.add(brr[b]-brr[a-1]);

        }
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
    }
}
