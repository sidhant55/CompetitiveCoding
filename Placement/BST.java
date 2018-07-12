package Placement;

import java.util.*;

public class BST {

    public static void insert(node1 parent, node1 ins)
    {
        while (parent!=null)
        {
            if (parent.val>ins.val) {
                if (parent.left==null)
                {
                    parent.left=ins;
                    break;
                }
                parent = parent.left;
            }
            else {
                if (parent.right==null)
                {
                    parent.right=ins;
                    break;
                }
                parent = parent.right;
            }
        }
        parent=ins;
    }

    public static  void search(node1 parent, int val)
    {
        while (parent!=null)
        {
            if (parent.val==val)
            {
                System.out.println("Found");
                return;
            }
            else if (parent.val>val)
                parent=parent.left;
            else
                parent=parent.right;
        }
        System.out.println("Not found");
        return;
    }

    public static void main(String args[]) {

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


        insert(parent, obj1);
        insert(parent, obj2);
        insert(parent, obj3);
        insert(parent, obj4);
        insert(parent, obj5);
        insert(parent, obj6);
        insert(parent, obj7);
        insert(parent, obj8);
        insert(parent, obj9);
        insert(parent, obj10);



        INORDER obj=new INORDER();
        obj.inord(parent);


        search(parent,36);
        search(parent,33);
    }
}
