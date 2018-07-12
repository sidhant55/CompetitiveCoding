package Placement;

import java.util.*;

public class RevStack {
    public static void main(String args[]) {

        StackP obj=new StackP();

        String x="abcdefghijkl";

        int l=x.length();
        for (int i=0;i<l;i++)
        {
            char ch=x.charAt(i);
            obj.push(ch);
        }
        String ans="";

        while (obj.top!=-1)
        {
            ans=ans+obj.pop();
        }
        System.out.println(ans);

    }
}
