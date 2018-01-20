package DynamicProgramming;
import java.util.ArrayList;
public class City {

    public static void main(String args[]) {
        inputs in=new inputs(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int n=in.nextInt();
            ArrayList<Long> al=new ArrayList<Long>();
            long b=in.nextLong();
            al.add(b);
            for (int i=1;i<n;i++)
            {
                long a=in.nextLong();
                al.add(al.get(i-1)+a);
            }
            long q=in.nextLong();
            for (long i=1;i<=q;i++)
            {
                int l=in.nextInt()-1;
                int r=in.nextInt()-1;
                if (l==0)
                    System.out.println(al.get(r));
                else
                    System.out.println((al.get(r)-al.get(l-1)));
            }
        }
    }
}



