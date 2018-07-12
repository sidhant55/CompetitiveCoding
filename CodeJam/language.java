package CodeJam;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;


public class language {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int k=1;k<=t;k++)
        {
            long n=in.nextLong();
            int l=in.nextInt();

            ArrayList<Double> arr=new ArrayList <>();

            long sum=0;
            for (int i=0;i<l;i++) {
                double tmp = (in.nextDouble());
                sum += tmp;
                arr.add((tmp*100.0)/n);
            }

            long left=n-sum;


            Collections.sort(arr, new Comparator<Double>() {
                @Override
                public int compare(Double o1, Double o2) {

                    double var1=o1-Math.floor(o1);
                    double var2=o2-Math.floor(o2);

                  if (var1<0.5 && var2<0.5)
                    {
                        if (var1>var2)
                            return -1;
                        else
                            return 1;
                    }
                    else if (var1<0.5 && var2>=0.5)
                    {
                        return -1;
                    }
                    else if (var1>=0.5 && var2<0.5)
                    {
                        return 1;
                    }
                    return 0;
                }
            });

            System.out.println(arr);    
        }
    }
}
