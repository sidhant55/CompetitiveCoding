package Placement;

import java.util.*;

public class RevRecStack {

    public static void insert(char ch, StackP obj)
    {
        if (obj.top!=-1)
        {
            char a=obj.pop();
            insert(ch,obj);
            obj.push(a);
        }
        else
        {
            obj.push(ch);
        }
    }

    public static void main(String args[]) {

        StackP obj=new StackP();
        obj.push('c');
        obj.push('h');
        obj.push('a');
        obj.push('r');
        obj.push('A');
        obj.push('t');

        insert('i',obj);

        obj.print();


    }
}
