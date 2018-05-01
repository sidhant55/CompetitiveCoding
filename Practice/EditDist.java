import java.util.*;
 
class EditDist
{
    static int a=0;
    static long dist(String str1,int l1,String str2,int l2, HashMap<String,Long> hm)
    {
        
        if (l1==0)
            return l2;
        if (l2==0)
            return l1;

        String key=str1.substring(l1)+"-"+str2.substring(l2);
        if (hm.containsKey(key))
            return hm.get(key);

        if (str1.charAt(l1-1)==str2.charAt(l2-1))
        {
            a++;
            long a= (dist(str1,l1-1,str2,l2-1,hm));
            hm.put(key,a);
            return a;
        }
        a++;
        long b= 1+Math.min(dist(str1,l1-1,str2,l2,hm),Math.min(dist(str1,l1,str2,l2-1,hm),dist(str1,l1-1,str2,l2-1,hm)));
        hm.put(key,b);
        return b;

    }
 
    // Driver Function to test above function
    public static void main(String args[])
    {
        String str1 = "abcd";
        String str2 = "aefg";

        HashMap<String,Long> hm=new HashMap<String,Long>();

        System.out.println(dist(str1,str1.length(),str2,str2.length(),hm));

        System.out.println(a);

    }
}