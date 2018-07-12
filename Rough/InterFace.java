package Rough;

import java.util.*;

interface A
{
    public void show();
}

public class InterFace {
    public static void main(String args[]) {

        B obj=new B();
        obj.show();

    }
}

class B implements A
{
    public void show()
    {
        System.out.println("SHOW");
    }
}
