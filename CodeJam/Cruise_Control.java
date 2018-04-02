package CodeJam;

import java.util.*;

public class Cruise_Control {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int j=1;j<=t;j++){
            long d=in.nextLong();
            int n=in.nextInt();
            long start[]=new long [n];
            long speed[]=new long [n];

            for (int i=0;i<n;i++)
            {
                start[i]=in.nextLong();
                speed[i]=in.nextLong();
            }

            double time[]=new double[n];
            double max=0;
            for (int i=0;i<n;i++)
            {
                time[i]=((d-start[i])*1.0)/(speed[i]*1.0);
                if (time[i]>max)
                    max=time[i];
            }

            double ans=d/max;
            System.out.println("Case #"+j+": "+ans);
        }
    }
}
