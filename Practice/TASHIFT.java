package Codechef;

import java.util.*;
class node10
{
    int n;
    String str;
}

public class TASHIFT {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String x=in.next();
        String y=in.next();
        int l=x.length();
        int max=0,ans=0;
        node10 arr[]= new node10 [l];
        Comp comp=new Comp();
        //TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(comp);
        for (int i=0;i<l;i++)
        {
            String z=y.substring(i,l)+y.substring(0,i);
            node10 obj=new node10();
            obj.str=z;
            obj.n=i;
            arr[i]=obj;
        }
        Arrays.sort(arr, new Comp());
//        for (int i=0;i<l;i++)
//        {
//            System.out.println(arr[i].n+" "+arr[i].str);
//        }
    }
}
class Comp implements Comparator<node10>
{
    @Override
    public int compare(node10 a, node10 b) {
        String str1=a.str;
        String str2=b.str;
        return str1.compareTo(str2);
    }
}
