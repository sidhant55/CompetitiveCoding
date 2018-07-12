package Rough;

import java.util.*;

public class thrd implements Runnable {
    @Override
    public void run()
    {
        System.out.println("thread");
    }

    public static void main(String args[]) {

        thrd obj=new thrd();
        obj.run();
    }
}
