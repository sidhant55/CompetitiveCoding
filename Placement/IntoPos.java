package Placement;

import java.util.*;

public class IntoPos {

    static int Prec(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public static void post(String x, StackP obj)
    {
        String ans="";
        for (int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);

            if (ch=='(')
                obj.push('(');
            else if (Character.isLetterOrDigit(ch))
            {
                ans+=ch;
            }
            else if(ch==')')
            {
                while(obj.top!=-1 && obj.peek()!='(')
                    ans+=obj.pop();

                if (obj.top!=-1 && obj.peek()=='(')
                    obj.pop();
            }
            else
            {
                try {
                    while (obj.top != -1 && Prec(ch) <= Prec(obj.peek())) {
                        ans += obj.pop();
                        System.out.println(ch);

                    }
                    obj.push(ch);
                }
                catch (Exception e)
                {
                    obj.print();
                }
            }
        }
        System.out.println(ans);
        obj.print();
    }

    public static void main(String args[]) {

        StackP obj=new StackP();

        String x="a+b*(c^d-e)^(f+g*h)-i";
        post(x,obj);
    }
}