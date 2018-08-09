package Codevita;

import java.util.*;

public class AlphaNum {



    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String x=in.next();

        HashMap<Integer,String> hm=new HashMap <>();
        hm.put(2,"ABC");
        hm.put(3,"DEF");
        hm.put(4,"GHI");
        hm.put(5,"JKL");
        hm.put(6,"MNO");
        hm.put(7,"PQRS");
        hm.put(8,"TUV");
        hm.put(9,"WXYZ");

        HashMap<Character,Boolean> hm1=new HashMap <>();

        int c=0;
        int l=x.length();
        for (int i = 0; i < l; i++) {
            char ch=hm.get(Integer.parseInt(x.charAt(i)+"")).charAt(0);

            if(hm1.containsKey(ch))
            {

            }
            else
            {
                hm1.put(ch,true);
                c++;
            }

        }

        for(int i=0;i<l-1;i++)
        {
            int a=Integer.parseInt(x.charAt(i)+"");
            int b=Integer.parseInt(x.charAt(i+1)+"");
            String y=hm.get(b);
            a=(a-1)%y.length();
            //a=y.length()-1-a;
            char ch1=y.charAt(a);
            if(hm1.containsKey(ch1))
            {

            }
            else {
                c++;
                hm1.put(ch1,true);
            }

        }
        System.out.println(hm1);
        System.out.println(c);
    }
}
