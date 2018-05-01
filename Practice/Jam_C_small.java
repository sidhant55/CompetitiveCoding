import java.util.*;
public class Jam_C_small
{
    public static void main (String args[])
    {
        System.out.println("Welcome");
        Scanner in=new Scanner (System.in);
        int t=in.nextInt();
        for (int u=1;u<=t;u++)
        {
            int n=in.nextInt();
            int k=in.nextInt();
            int a[]=new int [n+2];
            a[0]=1;
            a[n+1]=1;
            int c=0,en=0,st=0;
            while(--k>=0)
            {
                int m=0;
                for (int i=0;i<n+2;i++)
                {
                    if (a[i]==0)
                    c++;
                    else
                    {
                        if (c>m)
                        {
                            m=c;
                            //System.out.print(i+"  ");
                            en=i-1;
                            
                        }
                        c=0;
                    }
                }
                st=en-m+1;
                //System.out.print(st+" "+en+" "+m+"  ");
                a[(en+st)/2]=1;
                
                //for (int i=0;i<n+2;i++)
                //System.out.print(a[i]+" ");
                //System.out.println();
                if (k==0){
                int mid=(en+st)/2;
                int max=Math.max(en-mid,mid-st);
                int min=Math.min(en-mid,mid-st);
                System.out.println("Case #"+u+": "+max+" "+min);
            }
            }
        }
    }
}
                    