package Placement;

import java.util.*;

public class RevLinkedList {
    public static void main(String args[]) {

        LinkedListT obj=new LinkedListT();

        node head =new node(10);
        obj.insert(head,11);
        obj.insert(head,12);
        obj.insert(head,13);
        obj.insert(head,14);
        obj.insert(head,15);
        obj.insert(head,16);

        obj.print(head);


        node current=head;
        node temp=null;



        while (current!=null)
        {
            temp=current.back;
            current.back=current.next;
            current.next=temp;
            current=current.back;
        }

        head=temp.back;

        obj.print(head);

    }
}
