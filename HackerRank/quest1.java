package HackerRank;

import java.util.*;

class box implements Comparable<box>
{
    long st;
    long en;
    boolean flag;

    box(long st,long en,boolean flag)
    {
        this.st=st;
        this.en=en;
        this.flag=flag;
    }

    @Override
    public int compareTo(box a)
    {
        return (int)(this.en-a.en);
    }

}

public class quest1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {

            int n=in.nextInt();
            box arr[]=new box[n];
            for(int i=0;i<n;i++)
            {
                long s=in.nextLong();
                long e=in.nextLong();
                box obj=new box(s,e,false);
                arr[i]=obj;
            }

            Arrays.sort(arr);

            int c=0;
            int j=0;
            long a=0;
            long b=0;
            while(c<n)
            {
                long end=0;
                int cnt=0;
                for(int i=0;i<n;i++)
                {
                    if(arr[i].flag==false && arr[i].st>end)
                    {
                        c++;
                        end=arr[i].en;
                        cnt++;
                        arr[i].flag=true;
                    }
                }

                if(j==0)
                {
                    a=cnt;
                }
                if(j==1)
                {
                    b=cnt;
                }
                if(j%2==0)
                {
                    a=a^cnt;
                }
                else
                {
                    b=b^cnt;
                }
            }
            if(a>b)
                System.out.println("Alice");
            else if(b>a)
                System.out.println("Bob");
            else
                System.out.println("Tie");
        }
    }
}
