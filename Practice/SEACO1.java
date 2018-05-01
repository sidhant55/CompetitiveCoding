package Codechef;

import java.util.*;

public class SEACO1 {
    static HashMap<Integer,Long> hm;
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        StringBuilder result = new StringBuilder();
        while (--t >= 0) {

            int n=in.nextInt();
            int m=in.nextInt();
            HashMap<Integer,Long> arr=new HashMap<Integer, Long>();
            for (int i=0;i<n;i++)
                arr.put(i,(long)0);
            ArrayList<HashMap<Integer,Long>> list=new ArrayList<HashMap<Integer, Long>>();
            for (int i=0;i<=m;i++)
                list.add(new HashMap<Integer, Long>());

            hm=list.get(0);
            for (int i=0;i<n;i++)
            {
                hm.put(i,(long)0);
            }
//            list.add(hm);

            for (int i=1;i<=m;i++)
            {
                int a=in.nextInt();
                int b=in.nextInt();
                int c=in.nextInt();
                if (a==1)
                {
                    for (int j=b-1;j<=c-1;j++)
                    {
                        long temp=(arr.get(j))%1000000007;
                        arr.put(j,(temp+1)%1000000007);
                    }
                    hm=list.get(i);
                    for (int j=0;j<n;j++)
                    {
                        hm.put(j,arr.get(j));
                    }
                }
                else
                {
                    HashMap<Integer,Long> hm1=list.get(c);
                    HashMap<Integer,Long> hm2=list.get(b-1);
                    hm=list.get(i);
                    for (int j=0;j<n;j++)
                    {
                        long temp1=arr.get(j);
                        long temp2=hm1.get(j);
                        long temp3=hm2.get(j);
                        arr.put(j, (temp1+temp2-temp3)%1000000007);
                        hm.put(j,arr.get(j));
                    }
                }
                System.out.println(list+" "+arr);
            }
            for (int i=0;i<arr.size();i++)
            result.append(arr.get(i)+" ");
            result.append("/n");
        }
        System.out.print(result);
    }
}
