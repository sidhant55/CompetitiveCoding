package Placement;

import java.util.*;

public class Breath {

    public static void find(node1 tmp, int level, HashMap<Integer,Integer> hm)
    {

        if (tmp==null)
            return;
        if (hm.containsKey(level))
            hm.put(level,hm.get(level)+1);
        else
            hm.put(level,1);
        find(tmp.left,level+1,hm);
        find(tmp.right,level+1,hm);
    }

    public static void main(String args[]) {


        node1 par=new node1(1);
        node1 obj1=new node1(2);
        par.left(obj1);
        node1 obj2=new node1(3);
        obj1.left(obj2);
        node1 obj3=new node1(4);
        obj2.left(obj3);
        node1 obj4=new node1(5);
        obj3.left(obj4);
        node1 obj5=new node1(6);
        obj4.left(obj5);
        node1 obj6=new node1(7);
        obj5.left(obj6);

        HashMap<Integer, Integer> hm = new HashMap <>();
        find(par,0,hm);
        System.out.println( hm);

    }
}
