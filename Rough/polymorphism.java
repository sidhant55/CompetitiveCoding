package Rough;

import java.util.*;

public class polymorphism {
    public static void main(String args[]) {
        Iphone obj=new Iphone();
        obj.call();

    }
}

class phone
{
    phone()
    {
        System.out.println("phone");
    }

    static void call()
    {
        System.out.println("call phone");
    }
}

class Iphone extends phone
{
    Iphone()
    {
        System.out.println("IPHONE");
    }

    static void call(int a)
    {
        System.out.println("call IPHONE");
    }
}
