package Placement;

import java.util.*;

class node1
{

    int val;

    node1 left;
    node1 right;

    node1(int val)
    {
        left=null;
        right=null;
        this.val=val;
    }

    public void left(node1 child)
    {
        this.left=child;
    }

    public void right(node1 child)
    {
        this.right=child;
    }
}

public class BinTree {
    static node1 parent;


    public static void infix(node1 tmp)
    {
        if (tmp==null)
            return;
        infix(tmp.left);
        System.out.print(tmp.val+" ");
        infix(tmp.right);
    }

    public static void post(node1 tmp)
    {
        if (tmp==null)
            return;
        post(tmp.left);
        post(tmp.right);
        System.out.print(tmp.val+" ");
    }

    public static void pre(node1 tmp)
    {
        if (tmp==null)
            return;
        System.out.print(tmp.val+" ");
        pre(tmp.left);
        pre(tmp.right);
    }

    public static void main(String args[]) {

        node1 par=new node1(1);
        parent=par;

        node1 obj1=new node1(2);
        par.left(obj1);
        node1 obj2=new node1(3);
        par.right(obj2);
        node1 obj3=new node1(4);
        obj1.left(obj3);
        node1 obj4=new node1(5);
        obj1.right(obj4);
        node1 obj5=new node1(6);
        obj2.left(obj5);
        node1 obj6=new node1(7);
        obj2.right(obj6);

        infix(parent);
        System.out.println();
        pre(parent);
        System.out.println();
        post(parent);
        System.out.println();

    }
}
