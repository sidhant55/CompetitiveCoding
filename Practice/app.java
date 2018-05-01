/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class app
{
        public static void main (String[] args) throws java.lang.Exception
        {
            Queue<String> q = new LinkedList<>();
            q.add("a");
            q.add("b");
            q.add("c");
            q.add("d");
            q.add("e");
            q.add("f");
            q.add("g");
            q.add("h");
            q.add("i");
            q.add("j");
            q.add("j");
            q.add("h");
            // System.out.println(q.peek());
            // System.out.println(q.remove());
            // System.out.println(q.peek());
            // System.out.println(q.remove());
            // System.out.println(q.peek());
            // System.out.println(q.remove());
            // System.out.println(q.peek());
            //q.remove();
            Iterator itr = q.iterator();
            while(itr.hasNext())
            {
                System.out.println(q.peek());
                q.remove();
            }
        }
}
