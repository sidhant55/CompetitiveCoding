package Placement;

import java.util.*;

public class Depth {

    public static int find(node1 temp)
    {
        if (temp==null)
            return 0;

        return 1+Math.max(find(temp.left),find(temp.right));
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

        System.out.println(find(par));

    }
}
