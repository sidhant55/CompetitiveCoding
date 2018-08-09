package Rough;

import java.util.*;

public class Exception extends Throwable {
    public static void main(String args[]) {

        int a=0;
        final int b=1;

        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException ae)
        {
            System.out.println(ae);
        }
        finally {
            System.out.println("final block");
        }
    }
}
