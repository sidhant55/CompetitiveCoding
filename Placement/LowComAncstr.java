package Placement;

import java.util.*;

public class LowComAncstr {

    static int flag=0;

    public static node1 lca(node1 tmp, int a, int b)
    {

        if (flag==1)
            return tmp;

        if (tmp==null)
            return null;

        if (tmp.val>a && tmp.val>b)
            lca(tmp.left,a,b);
        if (tmp.val<a && tmp.val<b)
            lca(tmp.right,a,b);

        flag++;

        if (flag==1)
        System.out.println(tmp.val);


        return tmp;

    }

    public static void main(String args[]) {

        BST obj=new BST();

        node1 parent=new node1(25);
        node1 obj1=new node1(24);
        node1 obj2=new node1(19);
        node1 obj3=new node1(85);
        node1 obj4=new node1(36);
        node1 obj5=new node1(12);
        node1 obj6=new node1(5);
        node1 obj7=new node1(50);
        node1 obj8=new node1(23);
        node1 obj9=new node1(0);
        node1 obj10=new node1(11);

        obj.insert(parent, obj1);
        obj.insert(parent, obj2);
        obj.insert(parent, obj3);
        obj.insert(parent, obj4);
        obj.insert(parent, obj5);
        obj.insert(parent, obj6);
        obj.insert(parent, obj7);
        obj.insert(parent, obj8);
        obj.insert(parent, obj9);
        obj.insert(parent, obj10);

//        INORDER obj15=new INORDER();
//        obj15.inord(parent);


        lca(parent,0,50);

    }
}
