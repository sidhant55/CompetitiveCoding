package DynamicProgramming;

import java.util.*;

public class xSQUARE {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            String x=in.next();
            HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
            int opt=1;
            for (int i=0;i<x.length();i++)
            {
                char ch=x.charAt(i);
                if (hm.containsKey(ch))
                    hm.put(ch,hm.get(ch)+1);
                else
                    hm.put(ch,1);
            }
            for(Integer itg : hm.values()) {
                if(itg %2 != 0) {
                    opt = -1; break;
                }
            }
            System.out.println(opt);
        }
    }
}
