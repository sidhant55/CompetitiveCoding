package CodeJam;


import java.util.*;

public class Saving_Universe {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int cas=1;cas<=t;cas++)
        {
            long d=in.nextLong();

            String x=in.next();
            int l=x.length();
            long sum=0;
            int cnt=0;
            int cn=0;
            for (int i=0;i<l;i++)
            {
                if (x.charAt(i)=='C')
                    cnt++;
                else
                {
                    cn+=cnt;
                    cnt=0;
                    sum+=Math.pow(2,cn);
                }

            }
            char arr[]=new char[l];
            for (int i=0;i<l;i++)
            {
                if (x.charAt(i)=='C')
                    arr[i]='C';
                else
                    arr[i]='S';
            }

            long count=0;
            int c=0;

//            System.out.println(sum);
            if (sum<=d)
                System.out.println("Case #"+cas+": 0");
            else
            {
                int flag=0;
                for (int i=l-1;i>0;i--)
                {
                    if (arr[i]=='S'&& arr[i-1]=='C')
                    {
                        arr[i]='C';
                        arr[i-1]='S';
                        count++;
                        long val1= (long) Math.pow(2,cn);
                        long val2=(long)Math.pow(2,(cn-1));
                        sum=sum+val2-val1;

//                        System.out.println(i+" "+cn+" "+sum);

                        if (c>0) {
                            i = i + 2;
                            c--;
                        }
                        else
                            cn--;



                    }
                    else if (arr[i]=='S' && arr[i-1]=='S')
                    {
                        c++;
                    }


                    if (sum<=d)
                    {
                        flag=1;
                        break;
                    }
//                    for (int j=0;j<l;j++)
//                        System.out.print(arr[j]);
//                    System.out.println();
                }

                if (flag==1)
                    System.out.println("Case #"+cas+": "+count);
                else
                    System.out.println("Case #"+cas+": IMPOSSIBLE");

            }

        }
    }
}
