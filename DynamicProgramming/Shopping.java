//package DynamicProgramming;
//
//import java.util.*;
//
//public class Shopping {
//    static int count=0;
//    static long calc(a arr[],int n,int prev,HashMap<String,Long> hm)
//    {
//        count++;
//        if (n==arr.length)
//            return 0;
//        String x=n+"_"+prev;
//        if (hm.containsKey(x))
//            return hm.get(x);
//        if (n==0) {
//            long a= Math.min(arr[n].y + calc(arr, n + 1, 1,hm), Math.min(arr[n].z + calc(arr, n + 1, 2,hm), arr[n].x + calc(arr, n + 1, 0,hm)));
//            hm.put(x,a);
//            return a;
//        }
//
//        else if (prev==0) {
//            long a = Math.min(arr[n].y + calc(arr, n + 1, 1,hm), arr[n].z + calc(arr, n + 1, 2,hm));
//            //System.out.println(count+" " + a);
//            hm.put(x,a);
//            return a;
//        }
//        else if (prev==1) {
//            long a= Math.min(arr[n].x + calc(arr, n + 1, 0,hm), arr[n].z + calc(arr, n + 1, 2,hm));
//            //System.out.println(count+" "+a);
//            hm.put(x,a);
//            return a;
//        }
//        else if (prev==2) {
//            long a= Math.min(arr[n].y + calc(arr, n + 1, 1,hm), arr[n].x + calc(arr, n + 1, 0,hm));
//            //System.out.println(count+" "+a);
//            hm.put(x,a);
//            return a;
//        }
//        return 0;
//
//    }
//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        while (--t >= 0) {
//            int n=in.nextInt();
//            a arr[]=new a [n];
//            for (int i=0;i<n;i++)
//            {
//                a obj=new a();
//                obj.x=in.nextInt();
//                obj.y=in.nextInt();
//                obj.z=in.nextInt();
//                arr[i]=obj;
//            }
//            HashMap<String,Long> hm=new HashMap<String, Long>();
//            System.out.println (calc(arr,0,-1,hm));
//        }
//    }
//}
