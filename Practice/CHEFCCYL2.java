//package Codechef;
//
//import java.util.*;
//
//public class CHEFCCYL2 {
//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        while (--t >= 0) {
//            int n=in.nextInt();
//            int cycl[][]=new int[n][];
//            int q=in.nextInt();
//            for (int i=0;i<n;i++)
//            {
//                int size=in.nextInt();
//                cycl[i]=new int [size];
//                for (int j=0;j<size;j++)
//                    cycl[i][j]=in.nextInt();
//            }
//            int con[][]=new int [n][3];
//            for (int i=0;i<n;i++)
//            {
//                con[i][0]=in.nextInt()-1;
//                con[i][1]=in.nextInt()-1;
//                con[i][2]=in.nextInt();
//            }
//            int weight[]=new int[n];
//            for (int i=0;i<n;i++)
//            {
//                int v1=con[i][0];
//                int v2=con[(i%(n-1))][1];
//                int sum=0,sum1=0,sum2=0;
//                int size=cycl[i].length;
//                if (v1>v2)
//                {
//                    int c=v1-v2;
//                    for (int j=0;j<c;j++) {
//                        int ind=(v2+j);
//                        sum1 += cycl[i][ind];
//                    }
//                }
//                else
//                {
//                    int c=v2-v1;
//                    for (int j=0;j<c;j++) {
//                        int ind=(v1+j);
//                        sum1 += cycl[i][ind];
//                    }
//                }
//                for (int j=0;j<size;j++)
//                {
//                    sum+=cycl[i][j];
//                }
//                sum2=sum-sum1;
//                weight[i]=sum1<sum2?sum1:sum2;
//            }
//            for (int i=0;i<q;i++)
//            {
//                int v1=in.nextInt();
//                int c1=in.nextInt();
//                int v2=in.nextInt();
//                int c2=in.nextInt();
//                s
//                if (c1>c2)
//                {
//                    for (int j=c1+1;j<c2;j++) {
//                        sum1 += cycl[i][ind];
//                    }
//                }
//                else
//                {
//                    int c=v2-v1;
//                    for (int j=0;j<c;j++) {
//                        int ind=(v1+j);
//                        sum1 += cycl[i][ind];
//                    }
//                }
//            }
//        }
//    }
//}
