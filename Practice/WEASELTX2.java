package Codechef;


import java.math.BigInteger;
import java.util.*;

class Node
{
    int val;
    Node left;
    Node right;
    int index;
    Node(int a,Node b)
    {
        index=0;
        val=a;
        left=b;
        right=b;
    }
}

public class WEASELTX2 {
    static int calc(Node head, Node arr[],HashMap<String,Integer> hm)
    {
        int value=0;
        if (head==null)
            return 0;
//        String key=i+"_"+head.index;
//        if (hm.containsKey(key)) {
//            System.out.println("2 Yiepee "+key+" "+hm.get(key));
//            return hm.get(key);
//        }
        else
            value=(head.val^calc(head.left,arr,hm)^calc(head.right,arr,hm));
        arr[head.index].val=value;
//        hm.put(key, head.val);
//        System.out.println("1 Yiepee "+key+" "+hm.get(key));
        return value;
    }
    static long count(Node head)
    {
        if (head==null)
            return 0;
        return 1+count(head.left)+count(head.right);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        Node arr[]=new Node [a];
        HashMap<String,Integer> hm=new HashMap<String , Integer>();
        HashMap<Integer,Integer> hm1=new HashMap<Integer , Integer>();
        for (int i=0;i<a;i++)
        {
            Node obj=new Node(0,null);
            arr[i]=obj;
        }
        for (int i=0;i<a-1;i++)
        {
            int x=in.nextInt();
            int y=in.nextInt();
            if (arr[x].left==null)
                arr[x].left=arr[y];
            else
                arr[x].right=arr[y];
        }
        for (int i=0;i<a;i++) {
            arr[i].val = in.nextInt();
            arr[i].index=i;
        }
        long cnt=count(arr[0]);
        System.out.println(cnt);
        hm1.put(0,arr[0].val);
        for (int i=1;i<cnt;i++)
        {
            hm1.put(i,calc(arr[0],arr,hm));
//            for (int j=0;j<a;j++)
//                System.out.print(arr[j].val+" ");
//            System.out.println();
        }
//        System.out.println(hm1);
        for (int i=0;i<b;i++)
        {
            BigInteger bi = in.nextBigInteger();
            long l=bi.longValue();
            if (l>=cnt) {

                BigInteger bj=BigInteger.valueOf(cnt);
                BigInteger bi3 = bi.mod(bj);
                int z=bi3.intValue();
                System.out.println(hm1.get(z));
            }
            else
                System.out.println(hm1.get((int)l));
        }
    }
}
