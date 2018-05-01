package Codechef;

import java.util.*;
class cont
{
    long u,v,w;
}
public class CHEFCCYL3 {
    static long dis(int c, long v1,long v2,ArrayList<ArrayList<Long>> data,long arr[])
    {
        if (v1>v2)
        {
            long temp=v1;
            v1=v2;
            v2=temp;
        }
        //System.out.println(c+" "+(v2-1)+" "+prefix.size()+" "+prefix.get(c).size());
//        prefix.get(c).get(((int)v2-1));
//        prefix.get(c).get(((int)v1-1));
//        prefix.get(c).get((int)ele[c]);
//        prefix.get(c).get(((int)v2-1));
//        prefix.get(c).get((int)v1-1);
        return Math.min(Math.abs(data.get(c).get(((int)v2-1))-data.get(c).get(((int)v1-1))),Math.abs(data.get(c).get((int)arr[c])-data.get(c).get(((int)v2-1))+data.get(c).get((int)v1-1)));
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int n=in.nextInt();
            int q=in.nextInt();
            long arr[]=new long[n+1];
            ArrayList<ArrayList<Long>> data=new ArrayList <ArrayList<Long>>();
            data.add(new ArrayList());
            cont b[]=new cont[n+1];
            int i=1;
            while (i<=n)
            {
                long num=in.nextLong();
                arr[i]=num;
                data.add(new ArrayList());
                data.get(i).add(0l);
                for (int j=1;j<=num;j++)
                {
                    long wt=in.nextLong();
                    data.get(i).add(wt+(data.get(i).get(j-1)));
                }
                i++;
            }
            i=1;
            while (i<=n)
            {
                cont obj=new cont();
                obj.u=in.nextLong();
                obj.v=in.nextLong();
                obj.w=in.nextLong();
                b[i]=obj;
                i++;
            }
            long dis[]=new long[n+5];
            i=1;dis[1]=0;dis[0]=0;
            long connect[]=new long[n+2];connect[0]=0;connect[1]=0;
            for (i=2;i<=n;i++)
            {
                dis[i]=dis[i-1]+dis(i,b[i-1].v,b[i].u,data,arr);
                connect[i]=connect[i-1]+b[i-1].w;
            }
            connect[n+1]=connect[n]+b[n].w;
            while(--q>=0)
            {
                int v1=in.nextInt();
                int c1=in.nextInt();
                int v2=in.nextInt();
                int c2=in.nextInt();
                if (c1>c2)
                {
                    int temp=c2;c2=c1;c1=temp;temp=v1;v1=v2;v2=temp;
                }
                int mn;
                long w1=0;
                if (c1==1)
                {
                    w1=dis(1,b[n].v,b[1].u,data,arr);
                }
                else
                    w1=0;
                if (c1==1)
                {
                    mn=n;
                }
                else
                    mn=c1-1;
                long z1=dis(c1,v1,b[c1].u,data,arr)+dis[c2-1]+connect[c2]-dis[c1]-connect[c1]+dis(c2,b[c2-1].v,v2,data,arr);
                long z2=dis(c2,v2,b[c2].u,data,arr)+dis[n]-dis[c2]+connect[n+1]-connect[c2]+dis[c1-1]+connect[c1]+dis(1,b[n].v,b[1].u,data,arr)+dis(c1,b[mn].v,v1,data,arr)-w1;
                System.out.println(Math.min(z1,z2));
            }
        }
    }
}
