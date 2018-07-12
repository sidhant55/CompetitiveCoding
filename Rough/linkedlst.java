package Rough;

import Placement.LinkedListT;

import java.util.*;

public class linkedlst {
    public static void main(String args[]) {

        LinkedList<Integer> ll=new LinkedList <>();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        Iterator<Integer> it=ll.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
