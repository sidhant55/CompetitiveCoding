//package Codechef;
//
//import java.lang.reflect.Array;
//import java.util.*;
//
//class node
//{
//    int val;
//    node left;
//    node right;
//    int index;
//    node()
//    {
//        index=0;
//        val=0;
//        left=null;
//        right=null;
//    }
//}
//
//public class WEASELTX1 {
//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        int a=in.nextInt();
//        int b=in.nextInt();
//        Node arr[]=new Node [a];
//        for (int i=0;i<a;i++)
//        {
//            Node obj=new Node(0,null);
//            arr[i]=obj;
//        }
//        for (int i=0;i<a-1;i++)
//        {
//            int x=in.nextInt();
//            int y=in.nextInt();
//            if (arr[x].left==null)
//                arr[x].left=arr[y];
//            else
//                arr[x].right=arr[y];
//        }
//        ArrayList<ArrayList<Integer>> all=new ArrayList<ArrayList<Integer>>();
//        all.add(new ArrayList<Integer>());
//        ArrayList<Integer> al=all.get(0);
//        for (int i=0;i<a;i++) {
//            al.add(in.nextInt());
//        }
//        for (int i=1;i<=b;i++)
//        {
//            all.add(new ArrayList<Integer>());
//            int z=in.nextInt();
//            if (z<i)
//                System.out.println(all.get(i).get(0));
//            else
//            {
//                for (int )
//            }
//        }
//    }
//}
