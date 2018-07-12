package Placement;

import java.util.*;

public class StackP {
    ArrayList<Character> arr=new ArrayList <>();
    int top;

    StackP()
    {
        top=-1;
    }

    public void push(char val)
    {
        arr.add(val);
        top++;
    }

    public char pop()
    {
        if (top==-1)
        {
            System.out.println("Empty");
            return '0';
        }
        char val=arr.remove(top);
        top--;
        return val;
    }

    public void print()
    {
        System.out.println(arr);
    }

    public char peek()
    {
        return arr.get(top);
    }

    public static void main(String args[]) {

        StackP obj=new StackP();

        obj.push('1');
        obj.print();
        obj.push('2');
        obj.print();
        obj.push('3');
        obj.print();
        obj.pop();
        obj.print();
        obj.pop();
        obj.print();
        obj.push('4');
        obj.push('5');
        obj.push('6');
        obj.print();
        obj.pop();
        obj.print();
        obj.pop();
        obj.print();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();



    }
}
