package Placement;

import java.util.*;

public class INORDER {

    public static void inord(node1 tmp)
    {
        Stack<node1> obj=new Stack <>();

        while (tmp!=null)
        {
            obj.push(tmp);
            tmp=tmp.left;
        }

        while (!obj.isEmpty())
        {
            node1 temp=obj.pop();
            System.out.println(temp.val);
            if (temp.right!=null)
            {
                temp=temp.right;
                while(temp!=null)
                {
                    obj.push(temp);
                    temp=temp.left;
                }
            }
        }
    }

    public static void main(String args[]) {

        node1 par=new node1(1);
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

        inord(par);


    }
}
