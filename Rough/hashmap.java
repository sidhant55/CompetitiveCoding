package Rough;

import java.util.*;

public class hashmap {
    public static void main(String args[]) {

        HashMap<Integer,String> hm=new HashMap <>();
        hm.put(5,"Sidhant");
        hm.put(10,"Sankalp");
        hm.put(15,"Sunanda");
        hm.put(20,"Srikant");
//
//        for (Map.Entry<Integer,String> hm1: hm.entrySet())
//            System.out.println(hm1.getKey()+" "+hm1.getValue());

        hm.forEach((key,value)->System.out.println(key+" "+value));

        TreeMap<Integer,String> tm=new TreeMap <>(hm);

        tm.forEach((a,b)->System.out.println(a+" "+b));

        Hashtable<Integer,String> ht=new Hashtable <>(hm);
        System.out.println(ht);
//        System.out.println(ht.keys());
//        System.out.println(ht.values());

    }
}
