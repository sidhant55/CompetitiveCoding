import java.util.*;
 
class Minjump
{
  static int b=0;
    static int jump(int a[],int n,HashMap<Integer,Integer> hm)
    {
        if (n>=a.length)
          return 0;
        int min=999;
        if (hm.containsKey(n))
          return hm.get(n);
        b++;
        for (int i=1;i<=a[n];i++)
          min=Math.min(min,1+jump(a,n+i,hm));
        //System.out.print(min+" ");
        hm.put(n,min);
        return min;
    }
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
      HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int set[] = {1, 3, 6, 1, 0, 9};
        System.out.println(jump(set,0,hm)+" "+b);
    }
}