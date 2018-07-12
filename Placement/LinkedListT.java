package Placement;

import java.util.*;

class node
{
    int val;
    node next;
    node back;


    node(int val)
    {
        this.val=val;
        next=null;
        back=null;
    }
}

public class LinkedListT {

    static node head;

    public static void insert(node head,int val){
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        node nw=new node(val);

        temp.next=nw;
        nw.back=temp;
    }

    public static void print(node head)
    {
        node temp=head;
        do
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }while(temp!=null);
        System.out.println();
    }

    public static void delete(node head, int index)
    {
        node temp=head;
        int ind=1;
        while(temp.next!=null)
        {
            if (ind==index)
            {
                node a=temp.back;
                node b=temp.next;

                a.next=b;
                b.back=a;
                break;
            }
            ind++;
            temp=temp.next;
        }
    }

    public static void main(String args)
    {
        head=new node(1);

        insert(head,2);
        insert(head,3);
        insert(head,4);
        insert(head,5);
        insert(head,6);

        print(head);

        delete(head, 4);

        print(head);
    }
}
